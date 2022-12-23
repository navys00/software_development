package org.example;

public class Factory {
    static public IConverter getConverter(Type type)
    {
        IConverter converter = null;
        switch (type)
        {
            case txt:
            {
                converter = new Convert_to_txt();
            }
        }
        return converter;
    }
}
