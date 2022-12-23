package org.example;

public class Matrix_Event implements Event {
    private type_of_event _type;
    private Point[] _changes;
    public Matrix_Event(Point[] changes)
    {
        _type = type_of_event.ChangeOfMatrix;
        _changes = changes.clone();
    }
    @Override
    public type_of_event GetEventType()
    {
        return _type;
    }
    @Override
    public Object GetData()
    {
        return _changes;
    }
}
