public interface CarBuilder{
    void BuildEngine(String Engine);
    void BuildBody(String body);
    void BuildWheel(String Wheel);
    void PaintColor(String paint);
    Car getcar();
}