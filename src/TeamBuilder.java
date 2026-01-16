public interface TeamBuilder {
    TeamBuilder add(Role role, int count);
    Team build();
}
