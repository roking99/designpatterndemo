#结构型设计模式--桥接模式

模式简介
    
        桥接模式是一种实用的结构型设计模式,如果系统中某一个类存在两个独立变化的维度，通过桥接模式可以将两个维度分离出来，
    使两个维度可以独立扩展，让系统更加符合"单一职责原则"。与多层继承方案不同，桥接模式可以将两个独立变化的维度设计成两个
    独立的继承结构，并在两个独立的继承结构的抽象层建立一个抽象关联,建立的这个关联关系像一座桥连接两个独立的继承结构,并由
    此得名：桥接模式
     
设计理念
    
     将抽象部分与实现部分分离，使它们都可以独立变化。是一种对象结构型设计模式，又称为柄体模式或接口模式。
    
相关角色

    1、抽象类(Abstraction)
         用来定义抽象类的接口，但是一般情况下这个是抽象类而不是接口(拗口...)。定义了实现类接口类型的对象并可以维护该对象。
     与实现类接口具有关联关系，既可以包含抽象业务方法，也可以包含具体业务方法。（所以这一定是一个抽象类而不是接口...）
     
    2、扩充抽象类(RefinedAbstraction)
         扩充了由抽象类定义的接口，通常它不是抽象类而是具体类，实现类抽象类重定义的抽象业务方法，并可以直接调用实现类接
    口中定义的业务方法。
         
    3、实现类接口(Implementor)
         定义了实现类的接口，这个接口中的方法可以与抽象类中的方法完全不同，一般来说这个实现类只定义了基本操作，而抽象类
     中定义的接口可能会做更多复杂的业务。实现类接口只是定义了基本操作的方法，而具体的实现交给具体实现类来完成。由于抽象
     类中管理了实现类接口类型的对象，因此可以通过这个关联关系来调用到实现类接口中定义的方法，通过关联关系来替代继承关系。
     
    4、具体实现类(ConcreteImplementor)
         实现类了实现类接口中定义的方法，在具体执行时 由于“多态”的特性，将具体实现类对象替换其父类对象（实现类接口），
     给抽象类提供具体的业务操作方法。

优劣分析

    优点
        1、分离抽象类和实现类的强制绑定关系，实现了抽象与实现的解耦。使抽象与实现可以各自扩展。所谓抽象和实现沿着各自维
    度的变化，也就是说抽象和实现不再在同一个继承层次结构中，而是“子类化”它们，使它们各自都具有自己的子类，以便任何组合
    子类，从而获得多维度组合对象。
    
        2、可以替代多层继承方案，多层继承方案违反了“单一职责原则”。且解决了多层继承的复用性差，类的个数多的缺点
        
        3、提高了系统的可扩展性，由于桥接模式是通过关联关系来完成两个不同维度之间的调用。因此不同维度可以各自扩展而不必
    修改源码，符合“开闭原则”
    
    缺点
        1、增加了系统理解难度
        2、使用时需要识别出系统中独立变化的维度，这也需要很多的经验。
        综上：桥接模式是一个优秀的设计模式，但是并不是很容易上手，也会增加后续接手的维护人员带来系统理解的困难度
      
适用场景
     
     1、一个类中有两个以上独立变化维度
     2、系统需要增加“抽象”和“实现”的灵活性
     3、“抽象部分”和“实现部分”可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实
     现化子类的对象进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合
     4、对于那些不希望使用继承或因为多层继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
    
demo介绍
        
        Sunny软件公司欲开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式，例如txt、xml、pdf等格式，同时该工具
     需要支持多种不同的数据库。试使用桥接模式对其进行设计。
     
结构图
![](/bridgepattern/src/main/static/structure.jpg);