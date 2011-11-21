package imageEffects;

import org.eclipse.swt.graphics.*;

public class DropShadow {
	/**
	 * @param originalImageData The original image. Transparency information will be ignored.
	 * @param color The color of the drop shadow
	 * @param radius The radius of the drop shadow in pixels
	 * @param highlightRadius The radius of the highlight area
	 * @param opacity The opacity of the drop shadow
	 * @return The drop shadowed image.
	 * This image data will be larger than the original.
	 * The same image data will be returned if the shadow radius is 0,
	 * or null if an error occured.
	 */
	public static ImageData dropShadow(ImageData originalImageData, Color color, int radius, int highlightRadius, int opacity) {
		/*
		 * This method will create a drop shadowto the bottom-right of an existing image.
		 * This drop shadow is created by creating an altered one-sided glow, and shifting
		 * its position around the image.
		 * See the Glow class for more details of how the glow is calculated.
		 */
		if (originalImageData == null) return null;
		if (color == null) return null;
		if (radius == 0) return originalImageData;
		int shift = (int)(radius * 1.5); // distance to shift "glow" from image
		// the percent increase in color intensity in the highlight radius
		double highlightRadiusIncrease =	radius < highlightRadius * 2 ? .15 : radius < highlightRadius * 3 ? .09 : .02;
		opacity = opacity > 255 ? 255 : opacity < 0 ? 0 : opacity;	
		// prepare new image data with 24-bit direct palette to hold shadowed copy of image
		ImageData newImageData = new ImageData (originalImageData.width + radius * 2, originalImageData.height + radius * 2, 24, new PaletteData (0xFF, 0xFF00, 0xFF0000));
		int[] pixels = new int[originalImageData.width];
		// copy image data
		for (int row = radius; row < radius + originalImageData.height; row++) {
			originalImageData.getPixels (0, row - radius, originalImageData.width, pixels, 0);
			for (int col = 0; col < pixels.length; col++)
				pixels[col] = newImageData.palette.getPixel (originalImageData.palette.getRGB (pixels[col]));
			newImageData.setPixels (radius, row, originalImageData.width, pixels, 0);
		}
		// initialize glow pixel data
		int colorInt = newImageData.palette.getPixel (color.getRGB ());
		pixels = new int[newImageData.width];
		for (int i = 0; i < newImageData.width; i++) {
			pixels[i] = colorInt;
		}
		// initialize alpha values
		byte[] alphas = new byte[newImageData.width];
		// deal with alpha values on rows above and below the photo
		for (int row = 0; row < newImageData.height; row++) {
			if (row < radius) {
				// only calculate alpha values for top border. they will reflect to the bottom border
				byte intensity = (byte) (opacity * ((((row + 1)) / (double) (radius))));
				for (int col = 0; col < alphas.length / 2 + alphas.length % 2; col++) {
					if (col < radius) {
						// deal with corners:
						// calculate pixel's distance from image corner
						double hypotenuse = Math.sqrt (Math.pow (radius - col - 1, 2.0) + Math.pow (radius - 1 - row, 2.0));
						// calculate alpha based on percent distance from image
						alphas[col + shift] = alphas[alphas.length - col - 1] = (byte) (opacity * Math.max (((radius - hypotenuse) / radius), 0));
						// add highlight radius
						if (hypotenuse < Math.min (highlightRadius, radius * .5)) {
							alphas[col + shift] = alphas[alphas.length - col - 1] = (byte) Math.min (255, (alphas[col + shift] & 0x0FF)
													* (1 + highlightRadiusIncrease * Math.max (((radius - hypotenuse) / radius), 0)));
						}
					}
					else {
						alphas[col + shift] =
								alphas[alphas.length - col - 1] = (byte) ((row > Math.max (radius - highlightRadius - 1, radius * .5)) ?
										Math.min (255, (intensity & 0x0FF) * (1 + highlightRadiusIncrease * row / radius)) : intensity);
					}
				}
				if (row + shift < newImageData.height) {
					newImageData.setAlphas (newImageData.width - radius, row + shift, radius, alphas, alphas.length - radius);
					newImageData.setPixels (newImageData.width - radius, row + shift, radius, pixels, alphas.length - radius);
				}
				newImageData.setAlphas (0, newImageData.height - 1 - row, newImageData.width, alphas, 0);
				newImageData.setPixels (0, newImageData.height - 1 - row, newImageData.width, pixels, 0);
			}
			// deal with rows the image resides on
			else if (row <= newImageData.height / 2) {
				// calculate alpha values
				double intensity = 0;
				for (int col = 0; col < alphas.length; col++) {
					if (col < radius) {
						intensity = (opacity  * ((col + 1) / (double) radius));
						if (col > Math.max (radius - highlightRadius - 1, radius * .5)) {
							intensity =	Math.min (255, (intensity)	* (1 + highlightRadiusIncrease * col / radius));
						}
						alphas[newImageData.width - col - 1] = (byte) (int) (intensity);
						alphas[col] = 0;
					}
					else if (col <= newImageData.width / 2 + newImageData.width % 2) {
						// original image pixels are full opacity
						alphas[col] = alphas[newImageData.width - col - 1] = (byte) (255);
					}
				}
				newImageData.setPixels (0, newImageData.height - 1 - row, radius, pixels, 0);
				newImageData.setPixels (originalImageData.width + radius, newImageData.height - 1 - row, radius, pixels, 0);
				newImageData.setAlphas (0, newImageData.height - 1 - row, newImageData.width, alphas, 0);
				if (row >= shift + radius) {
					newImageData.setPixels (0, row, radius, pixels, 0);
					newImageData.setPixels (originalImageData.width + radius, row, radius, pixels, 0);
					newImageData.setAlphas (0, row, newImageData.width, alphas, 0);
				} else {
					newImageData.setPixels (0, row, radius, pixels, 0);
					newImageData.setAlphas (0, row, newImageData.width - radius, alphas, 0);
				}
			}
		}
		return newImageData;
	}
}
