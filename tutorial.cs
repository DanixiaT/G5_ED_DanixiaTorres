class Calculadora
    {
        static void Main(string[] args)
        {
        Console.Title = "operaciones basicas";
        }

        string resp = "";
    do{

  

    } while (resp == "s" || resp == "s"); 

    int v1 = 0; 
    int v2 = 0; 
    int R = 0; 

    Console.WriteLine("Presione el simbolo para realizar la operacion");

    Console.WriteLine("+ sumar");
    Console.WriteLine("- restar");
    Console.WriteLine("* multiplicar");
    Console.WriteLine("/ dividir");
    Console.Write("elige tu operacion: "); 
    resp = Console.ReadLine();
    string eleccion = Convert.ToString(resp);

    Console.WriteLine("Ingrese sus dos numeros");
    Console.Write("Primer numero: ");
    v1 = int.Parse(Console.ReadLine());
    Console.Write("Segundo numero: ");
    v2 = int.Parse(Console.ReadLine());
    Console.WriteLine();

    switch (eleccion)
    {
    case "+": 
    Console.WriteLine("El resultado de la suma es:");
    R = v1 + v2;
    Console.WriteLine("{0} + {1} = {2}", v1, v2, R);
    break;
    case "-":
    Console.WriteLine("El resultado de la resta es:");
    R = v1 - v2;
    Console.WriteLine("{0} - {1} = {2}", v1, v2, R);
    break;
    case "*": 
    Console.WriteLine("El resultado de la multiplicacion es:");
    R = v1 * v2;
    Console.WriteLine("{0} * {1} = {2}", v1, v2, R);
    break;
    case "/": 
    Console.WriteLine("El resultado de la division es:");
    R = v1 / v2;
    Console.WriteLine("{0} / {1} = {2}", v1, v2, R);
    break;
    }
}


