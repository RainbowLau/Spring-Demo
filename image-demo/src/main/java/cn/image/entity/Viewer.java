/**
  * Copyright 2018 bejson.com 
  */
package cn.image.entity;
import java.util.List;

/**
 * Auto-generated: 2018-01-24 15:22:57
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Viewer {

    private String pageText;
    private boolean isFixedZoom;
    private boolean isBatchRotate;
    private boolean isBatchMark;
    private boolean isBatchStamp;
    private boolean isUniqueMark;
    private String markAccess;
    private String canvasAccess;
    private String pageSize;
    private DrawTool drawTool;
    private List<StampStyles> stampStyles;
    private String stampStyleIndex;
    private boolean isPrintView;
    private boolean isMediaView;
    private boolean isPdfView;
    private List<MarkStyles> markStyles;
    public void setPageText(String pageText) {
         this.pageText = pageText;
     }
     public String getPageText() {
         return pageText;
     }

    public void setIsFixedZoom(boolean isFixedZoom) {
         this.isFixedZoom = isFixedZoom;
     }
     public boolean getIsFixedZoom() {
         return isFixedZoom;
     }

    public void setIsBatchRotate(boolean isBatchRotate) {
         this.isBatchRotate = isBatchRotate;
     }
     public boolean getIsBatchRotate() {
         return isBatchRotate;
     }

    public void setIsBatchMark(boolean isBatchMark) {
         this.isBatchMark = isBatchMark;
     }
     public boolean getIsBatchMark() {
         return isBatchMark;
     }

    public void setIsBatchStamp(boolean isBatchStamp) {
         this.isBatchStamp = isBatchStamp;
     }
     public boolean getIsBatchStamp() {
         return isBatchStamp;
     }

    public void setIsUniqueMark(boolean isUniqueMark) {
         this.isUniqueMark = isUniqueMark;
     }
     public boolean getIsUniqueMark() {
         return isUniqueMark;
     }

    public void setMarkAccess(String markAccess) {
         this.markAccess = markAccess;
     }
     public String getMarkAccess() {
         return markAccess;
     }

    public void setCanvasAccess(String canvasAccess) {
         this.canvasAccess = canvasAccess;
     }
     public String getCanvasAccess() {
         return canvasAccess;
     }

    public void setPageSize(String pageSize) {
         this.pageSize = pageSize;
     }
     public String getPageSize() {
         return pageSize;
     }

    public void setDrawTool(DrawTool drawTool) {
         this.drawTool = drawTool;
     }
     public DrawTool getDrawTool() {
         return drawTool;
     }

    public void setStampStyles(List<StampStyles> stampStyles) {
         this.stampStyles = stampStyles;
     }
     public List<StampStyles> getStampStyles() {
         return stampStyles;
     }

    public void setStampStyleIndex(String stampStyleIndex) {
         this.stampStyleIndex = stampStyleIndex;
     }
     public String getStampStyleIndex() {
         return stampStyleIndex;
     }

    public void setIsPrintView(boolean isPrintView) {
         this.isPrintView = isPrintView;
     }
     public boolean getIsPrintView() {
         return isPrintView;
     }

    public void setIsMediaView(boolean isMediaView) {
         this.isMediaView = isMediaView;
     }
     public boolean getIsMediaView() {
         return isMediaView;
     }

    public void setIsPdfView(boolean isPdfView) {
         this.isPdfView = isPdfView;
     }
     public boolean getIsPdfView() {
         return isPdfView;
     }
	public List<MarkStyles> getMarkStyles() {
		return markStyles;
	}
	public void setMarkStyles(List<MarkStyles> markStyles) {
		this.markStyles = markStyles;
	}

}