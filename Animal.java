public abstract class Animal {
  protected String name;

  public Animal(String name) {
    super();
    this.name = name;
  }

  public Animal() {
    this("anônimo");
  }

  public void talk() {
    System.out.printf("%s diz ...%n", this.name);
  }
}
