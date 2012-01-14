function modify() {
	var ss = document.styleSheets[1];
	
	var iconRule;
	var iconRuleIndex;
	
	var folderIconRule;
	var folderIconRuleIndex;
	
	var subRule;
	var subRuleIndex;
	
	for ( var i = 0; i < ss.cssRules.length; i++) {
		var rule = ss.cssRules[i];
		if (rule.selectorText == ".scroll-tree .icon") {
			iconRule=rule;
			iconRuleIndex=i;
		} else if (rule.selectorText==".scroll-tree .folder-icon") {
			folderIconRule=rule;
			folderIconRuleIndex=i;
		} else if (rule.selectorText==".folder-icon, .sub-icon, .tag-icon") {
			subRule=rule;
			subRuleIndex=i;
		}
	}
	
	if (iconRule) {
		var newText=iconRule.cssText.replace("url(https://www.google.com/reader/ui/3660573864-lhn-sprite.png)", "url(https://ssl.gstatic.com/docs/doclist/images/collectionsprite_1.png)");
		ss.deleteRule(iconRuleIndex);
		ss.insertRule(newText, iconRuleIndex);
	}
	
	if (folderIconRule) {
		newText=folderIconRule.cssText.replace("-42px -118px", "-342px 0");
		ss.deleteRule(folderIconRuleIndex);
		ss.insertRule(newText, folderIconRuleIndex);
	}
	
	if (subRule) {
		newText=subRule.cssText.replace("opacity: 0.4", "opacity: 0.8");
		console.log(newText);
		ss.deleteRule(subRuleIndex);
		ss.insertRule(newText, subRuleIndex);
	}
	
}
modify();