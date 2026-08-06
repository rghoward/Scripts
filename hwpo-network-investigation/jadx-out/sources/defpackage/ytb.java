package defpackage;

import io.ably.lib.transport.Defaults;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ytb {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = z2a.D(z2a.C(lg7.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(f55 f55Var, f55 f55Var2) {
        f55Var.getClass();
        f55Var2.getClass();
        return xj5.a(f55Var.d, f55Var2.d) && f55Var.e == f55Var2.e && xj5.a(f55Var.a, f55Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            p.a("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            ca0.a("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        ca0.a("timeout".concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!xj5.a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(qu8 qu8Var) {
        String strD = qu8Var.y.d("Content-Length");
        if (strD == null) {
            return -1L;
        }
        byte[] bArr = vtb.a;
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(hy0 hy0Var, Charset charset) {
        hy0Var.getClass();
        charset.getClass();
        int iS = hy0Var.s(vtb.b);
        if (iS == -1) {
            return charset;
        }
        if (iS == 0) {
            return ua1.b;
        }
        if (iS == 1) {
            return ua1.c;
        }
        if (iS == 2) {
            ua1.a.getClass();
            Charset charset2 = ua1.f;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            ua1.f = charsetForName;
            return charsetForName;
        }
        if (iS == 3) {
            return ua1.d;
        }
        if (iS != 4) {
            throw new AssertionError();
        }
        ua1.a.getClass();
        Charset charset3 = ua1.g;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        ua1.g = charsetForName2;
        return charsetForName2;
    }

    public static final <T> T g(Object obj, Class<T> cls, String str) throws IllegalAccessException {
        Object objG;
        cls.getClass();
        Class<?> superclass = obj.getClass();
        while (true) {
            T tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (objG = g(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) g(objG, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    tCast = cls.cast(obj2);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                superclass.getClass();
            }
        }
    }

    public static final boolean h(kw9 kw9Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = kw9Var.timeout().e() ? kw9Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        kw9Var.timeout().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            tx0 tx0Var = new tx0();
            while (kw9Var.O(tx0Var, 8192L) != -1) {
                tx0Var.h();
            }
            if (jC == Long.MAX_VALUE) {
                kw9Var.timeout().a();
                return true;
            }
            kw9Var.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                kw9Var.timeout().a();
                return false;
            }
            kw9Var.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                kw9Var.timeout().a();
            } else {
                kw9Var.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final nu4 i(List<cu4> list) {
        nu4.a aVar = new nu4.a();
        for (cu4 cu4Var : list) {
            rtb.a(aVar, cu4Var.a.w(), cu4Var.b.w());
        }
        return aVar.d();
    }

    public static final String j(f55 f55Var, boolean z) {
        int i;
        f55Var.getClass();
        int i2 = f55Var.e;
        String strA = f55Var.d;
        if (z2a.o(strA, ":", false)) {
            strA = eca.a(']', "[", strA);
        }
        if (!z) {
            String str = f55Var.a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? Defaults.TLS_PORT : -1;
            }
            if (i2 == i) {
                return strA;
            }
        }
        return strA + ':' + i2;
    }

    public static final <T> List<T> k(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return hf3.t;
        }
        if (list.size() == 1) {
            List<T> listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final <T> List<T> l(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return hf3.t;
        }
        if (tArr.length == 1) {
            List<T> listSingletonList = Collections.singletonList(tArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr = (Object[]) tArr.clone();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
