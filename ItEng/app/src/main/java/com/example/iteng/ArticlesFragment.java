package com.example.iteng;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArticlesFragment extends Fragment {

    TextView article1,article2,article3,text1,text2,text3;


    public ArticlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articles, container, false);

        article1=view.findViewById(R.id.Title1);
        article2=view.findViewById(R.id.Title2);
        article3=view.findViewById(R.id.Title3);
        text1=view.findViewById(R.id.text1);
        text2=view.findViewById(R.id.text2);
        text3=view.findViewById(R.id.text3);

        article1.setText("It's easy to develop apps");
        text1.setText("\n"+"To develop apps that take advantage of the Android operating system and UI, use the Android software development kit (SDK). The SDK includes software libraries of prewritten code, a debugger, a device emulator, documentation, sample code, and tutorials. Use the SDK to create apps that look great and take advantage of the hardware capabilities available on each Android-powered device.\n" +
                "\n" +
                "To develop apps using the SDK, you use the Java programming language to develop the app and Extensible Markup Language (XML) files to describe data resources. By writing the code in Java and creating a single app binary, you create an app that can run on both phone and tablet form factors. You can declare your UI in lightweight sets of XML resources. For example, create one set for parts of the UI that are common to all form factors, and other sets for features specific to phones or tablets. At runtime, Android applies the correct resource sets based on the device's screen size, screen density, locale, and so on.\n" +
                "\n" +
                "To help you develop your apps efficiently, Google offers an integrated development environment (IDE) called Android Studio. It offers advanced features for developing, debugging, and packaging Android apps. Using Android Studio, you can develop for any Android-powered device, or create virtual devices that emulate any hardware configuration.\n" +
                "\n" +
                "Android provides a rich development architecture. You don't need to know much about the components of this architecture, but it is useful to know what is available in the system for your app to use. The following diagram shows the major components of the Android stack—the operating system and development architecture.");


        article2.setText("\n"+"The Android platform");
                text2.setText("\n"+"Looking at Android’s breadth of capabilities, it would be easy to confuse it with a desktop operating system. Android is a layered environment, one that is built upon a foundation of the Linux kernel and includes rich functionality. The user interface subsystem includes everything you would expect from a mature operating system environment including windows, views, and widgets for displaying common elements like edit boxes, lists, or drop-down lists. The browser is both capable for general web browsing and available for embedding directly into your own application.\n" +
                "\n" +
                "In the past decade, the mobile web has been transformed by the adoption of smartphones across consumer and business applications, including Android. “Responsive” web technologies have made the utility of mobile devices greatly enhanced.\n" +
                "\n" +
                "Figure 1 displays a simplified view of the Android software layers:\n" +
                "\n" +
                "Applications: Built-in applications, such as phone, contacts, browser, and more. The specific applications vary by Android version and manufacturer. Commercial applications from marketplaces, such as Google Play, Amazon, and more. Side-loaded applications, including the ones you will build. You install these via USB cable.\n" +
                "Application frameworks, such as telephony manager, location manager, notification manager, content providers, windowing, resource manager, and more.\n" +
                "Libraries, such as graphics libraries, media libraries, database libraries, sensors, and so on.\n" +
                "The Android runtime is responsible for executing and managing applications as they run.\n" +
                "Linux Kernel, including power, file system, drivers, process management, and more.");

                article3.setText("\n"+"Application architecture");
                text3.setText("\n"+"An important aspect of the Android application environment is that Android applications have historically been written in the Java™ programming language. However, you can also write them in a relatively new programming language from Google called Kotlin. This article focuses exclusively on Java, but Kotlin is gaining momentum and you might consider taking a closer look. Between the trend toward “newer is better” in programming languages (for example, Swift is overtaking Objective-C for iOS/Apple development) and the ongoing legal battle over where Java can or cannot be used, Kotlin will likely be the leading language for Android within a few years.\n" +
                        "\n" +
                        "You can read more about the lawsuit between Oracle and Google about Google’s use of Java in its Android operating system in this Wikipedia article.\n" +
                        "\n" +
                        "For now, Java is the incumbent technology. If you’re just starting out, Java is a safe place to work for a couple of reasons. First, there is a decade’s worth of Android resources on the web focused on Java. Second, Java is a language that still has life in it for other platforms – particularly server-side web technologies. As a classic object-oriented programming language, Java skills still matter.\n" +
                        "\n" +
                        "While it might not matter at this point, there are some interesting details around how Android applications come to life from their underlying source code. Again, in this article, our focus is on Java programming.\n" +
                        "\n" +
                        "Java source code is compiled and formatted into bytecode, which represents the logic of an application but not the specific instructions for a particular hardware device. Similar to traditional Java environments, early versions of Android operated by converting these so-called bytecodes to hardware-specific executable code. This conversion magic is accomplished by using a Just-In-Time (JIT) compiler and takes place each and every time the application is executed. Once the JIT compiler has converted the code, it is executed in a virtual machine known as the Dalvik VM.\n" +
                        "\n" +
                        "Beginning with Android version 4.4 (KitKat), the Dalvik VM has been replaced. The JIT compiler converts bytecodes to executable code directly on the device at runtime each time the application runs; the new approach is called Ahead-of-Time (AOT) compilation. With AOT compilation, the byte code is converted only once when the application is installed. This slows down the one-time activity of installing the application but gains the benefit of faster execution at run time when it really matters.\n" +
                        "\n" +
                        "With AOT, we enjoy faster runtime experience with lower RAM requirements at the expense of more storage requirements. Considering the incessant decline in the cost of storage, this is an agreeable direction to move in for our mobile applications. Figure 2 contrasts the old and the new execution environments.");





        return view;

    }


}


