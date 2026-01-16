public interface Worker {
    String getId();
    String getName();
    String getType(); // BlueCollar / WhiteCollar / Manager
    String getRole(); // Frontend / Backend / ...
}
