static void PrintInterfaces(Type t){
	Type[]interfaces = t.getInterfaces();
	String res = "";
	if(interfaces == null || interfaces.length == 0) return;
	foreach(Type i in interfaces)
		res+=i.Name+" ";
	Console.write(res);
}