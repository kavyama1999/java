public class Quality 
{
//states

String productType;
boolean isCertified;
boolean isInspected;


//Behaviours

void certifyProduct()
{
System.out.println("certifyProduct");
}

void inspectProduct()
{
System.out.println("inspectProduct");
}

void improveQuality()
{
System.out.println("improveQuality");
}

void reportQualityMetrics()
{
System.out.println("reportQualityMetrics");
}

Quality(String productType,boolean isCertified,boolean isInspected)
{
this.productType=productType;
this.isCertified=isCertified;
this.isInspected=isInspected;
}
}