package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ae6 {
    public static volatile int a;
    public static final p4a b = new p4a();
    public static final d47 c = new d47();
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSetB;
        try {
            if (g()) {
                linkedHashSetB = null;
            } else {
                linkedHashSetB = b();
                j(linkedHashSetB);
            }
            StaticLoggerBinder.getSingleton();
            a = 3;
            i(linkedHashSetB);
            c();
            h();
            p4a p4aVar = b;
            p4aVar.u.clear();
            p4aVar.v.clear();
        } catch (Exception e2) {
            a = 2;
            System.err.println("Failed to instantiate SLF4J LoggerFactory");
            System.err.println("Reported exception:");
            e2.printStackTrace();
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            String message = e3.getMessage();
            if (message == null || !(message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                a = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e3.printStackTrace();
                throw e3;
            }
            a = 4;
            m6b.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            m6b.a("Defaulting to no-operation (NOP) logger implementation");
            m6b.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message2 = e4.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                a = 2;
                m6b.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                m6b.a("Your binding is version 1.5.5 or earlier.");
                m6b.a("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = ae6.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e2) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e2.printStackTrace();
            return linkedHashSet;
        }
    }

    public static void c() {
        p4a p4aVar = b;
        synchronized (p4aVar) {
            try {
                p4aVar.t = true;
                ArrayList arrayList = new ArrayList(p4aVar.u.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    o4a o4aVar = (o4a) obj;
                    o4aVar.u = f(o4aVar.t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ILoggerFactory d() {
        if (a == 0) {
            synchronized (ae6.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            k();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            aa0.c("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        aa0.c("Unreachable code");
        return null;
    }

    public static yd6 e(Class<?> cls) {
        int i;
        yd6 yd6VarF = f(cls.getName());
        if (d) {
            m6b.a aVar = m6b.a;
            Class<?> cls2 = null;
            if (aVar == null) {
                if (m6b.b) {
                    aVar = null;
                } else {
                    try {
                        aVar = new m6b.a();
                    } catch (SecurityException unused) {
                        aVar = null;
                    }
                    m6b.a = aVar;
                    m6b.b = true;
                }
            }
            if (aVar != null) {
                Class<?>[] classContext = aVar.getClassContext();
                String name = m6b.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    aa0.c("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                m6b.a("Detected logger name mismatch. Given name: \"" + yd6VarF.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                m6b.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return yd6VarF;
    }

    public static yd6 f(String str) {
        return d().b(str);
    }

    public static boolean g() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static void h() {
        LinkedBlockingQueue<q4a> linkedBlockingQueue = b.v;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                q4a q4aVar = (q4a) obj;
                if (q4aVar != null) {
                    o4a o4aVar = q4aVar.a;
                    String str = o4aVar.t;
                    if (o4aVar.u == null) {
                        aa0.c("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(o4aVar.u instanceof c47)) {
                        if (!o4aVar.e()) {
                            m6b.a(str);
                        } else if (o4aVar.e()) {
                            try {
                                o4aVar.w.invoke(o4aVar.u, q4aVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i3 = i + 1;
                if (i == 0) {
                    if (q4aVar.a.e()) {
                        m6b.a("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        m6b.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        m6b.a("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(q4aVar.a.u instanceof c47)) {
                        m6b.a("The following set of substitute loggers may have been accessed");
                        m6b.a("during the initialization phase. Logging calls during this");
                        m6b.a("phase were not honored. However, subsequent logging calls to these");
                        m6b.a("loggers will work as normally expected.");
                        m6b.a("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i3;
            }
            arrayList.clear();
        }
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        m6b.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void j(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            m6b.a("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                m6b.a("Found binding in [" + ((URL) it.next()) + "]");
            }
            m6b.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void k() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            m6b.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            m6b.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
