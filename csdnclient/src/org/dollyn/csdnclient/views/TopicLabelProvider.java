package org.dollyn.csdnclient.views;

import org.dollyn.csdnclient.model.Topic;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class TopicLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		Topic topic = (Topic)element;
		if(columnIndex == 0) {
			return topic.getTitle();
		} else if(columnIndex == 1) {
			return topic.getAuthor();
		}
		return null;
	}
}
