package def.primeng.primeng;
import def.angular.core.EventEmitter;
import def.js.Function;
public class Checkbox extends def.js.Object {
    public Object value;
    public String name;
    public Boolean disabled;
    public String binary;
    public String label;
    public EventEmitter<?> onChange;
    public Object model;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean hover;
    public Boolean focused;
    public Boolean checked;
    native public void onClick(Object event, Object checkbox, Boolean focus);
    native public Boolean isChecked();
    native public void removeValue(Object value);
    native public void addValue(Object value);
    native public void onFocus(Object event);
    native public void onBlur(Object event);
    native public double findValueIndex(Object value);
    native public void writeValue(Object model);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
}

