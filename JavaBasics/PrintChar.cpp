#include<iostream>
int main()
{
	for(char i = 0; i <= 126; i++)
	{
		if(std::isprint(i))
		{
			std::cout<<(int)i<<"  "<<i<<"\n";
		}
	}
	//system("pause");
	std::cin.get();
	return 0;
}
