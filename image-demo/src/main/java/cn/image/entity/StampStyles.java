package cn.image.entity;

public class StampStyles {
	private String index;
	private String value;
	private String text;
	public String getScale() {
		return scale;
	}
	public String getTipText() {
		return tipText;
	}
	public String getLayout() {
		return layout;
	}
	public String getMargin() {
		return margin;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public void setTipText(String tipText) {
		this.tipText = tipText;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public void setMargin(String margin) {
		this.margin = margin;
	}
	private String scale;
	private String tipText;
	private String layout;
	private String margin;
	private String fontId;
	public String getIndex() {
		return index;
	}
	public String getValue() {
		return value;
	}
	public String getText() {
		return text;
	}
	public String getFontId() {
		return fontId;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setFontId(String fontId) {
		this.fontId = fontId;
	}
}
