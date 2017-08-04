package def.primeng.primeng;

import def.angular.core.TemplateRef;
import def.angular.core.ViewContainerRef;

public class RowExpansionLoader extends def.js.Object {
    public ViewContainerRef viewContainer;
    public TemplateRef<?> template;
    public Object rowData;
    public RowExpansionLoader(ViewContainerRef viewContainer){}
    native public void ngOnInit();
    protected RowExpansionLoader(){}
}

