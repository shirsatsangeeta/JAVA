		import java.util.Scanner;
		class Car{
			Scanner sc=new Scanner(System.in);
			
			private
			String CarBrand;
			String CarName;
		public 
		void CarGetdata(){
		System.out.print("\n Enter the Car Brand: ");
			CarBrand=sc.nextLine();
		System.out.print("\n Enter the Car Name: ");
			CarName=sc.nextLine();

		}
		void CarPutdata(){	
			System.out.print("\n Brand = "+CarBrand);
			System.out.print("\n Name = "+CarName);
		}	
		}
		class Carmodel extends Car{
				String CarColor;
				int CarModelNo;
				
		void CarModelGetdata(){
		System.out.print("\n Enter the Car Color : ");
			CarColor=sc.nextLine();
		System.out.print("\n Enter the Car Model No : ");
			CarModelNo=sc.nextInt();
		}
		void CarModelPutdata(){	
			System.out.print("\n Color = "+CarColor);
			System.out.print("\n Model no = "+CarModelNo);
		}	

		}
		class CarSpecification extends Carmodel{
			double mileage;
			int HorsePower;
			
		void CarSpecificationGetdata(){
		System.out.print("\n Enter the Car Mileage : ");
			mileage=sc.nextDouble();
		System.out.print("\n Enter the Car HorsePower: ");
			HorsePower=sc.nextInt();

		}
		void CarSpecificationPutdata(){	
			System.out.print("\n Mileage = "+mileage+"(Km/L)");
			System.out.print("\n Horse Power = "+HorsePower+" hp ");
		}
			 public static void main(String arg[]){
				 CarSpecification car1=new CarSpecification();
				 car1.CarGetdata();
				 car1.CarModelGetdata();
				 car1.CarSpecificationGetdata();
				 
				 car1.CarPutdata();
				 car1.CarModelPutdata();
				 car1.CarSpecificationPutdata();
				 
		}
		}