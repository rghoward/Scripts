package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i3b {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final e c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends e {
        @Override // i3b.e
        public final boolean c(long j, Object obj) {
            return i3b.g ? i3b.b(j, obj) : i3b.c(j, obj);
        }

        @Override // i3b.e
        public final double d(long j, Object obj) {
            return Double.longBitsToDouble(g(j, obj));
        }

        @Override // i3b.e
        public final float e(long j, Object obj) {
            return Float.intBitsToFloat(f(j, obj));
        }

        @Override // i3b.e
        public final void j(Object obj, long j, boolean z) {
            if (i3b.g) {
                i3b.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                i3b.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // i3b.e
        public final void k(Object obj, long j, byte b) {
            if (i3b.g) {
                i3b.k(obj, j, b);
            } else {
                i3b.l(obj, j, b);
            }
        }

        @Override // i3b.e
        public final void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        @Override // i3b.e
        public final void m(Object obj, long j, float f) {
            n(obj, j, Float.floatToIntBits(f));
        }

        @Override // i3b.e
        public final boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends e {
        @Override // i3b.e
        public final boolean c(long j, Object obj) {
            return i3b.g ? i3b.b(j, obj) : i3b.c(j, obj);
        }

        @Override // i3b.e
        public final double d(long j, Object obj) {
            return Double.longBitsToDouble(g(j, obj));
        }

        @Override // i3b.e
        public final float e(long j, Object obj) {
            return Float.intBitsToFloat(f(j, obj));
        }

        @Override // i3b.e
        public final void j(Object obj, long j, boolean z) {
            if (i3b.g) {
                i3b.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                i3b.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // i3b.e
        public final void k(Object obj, long j, byte b) {
            if (i3b.g) {
                i3b.k(obj, j, b);
            } else {
                i3b.l(obj, j, b);
            }
        }

        @Override // i3b.e
        public final void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        @Override // i3b.e
        public final void m(Object obj, long j, float f) {
            n(obj, j, Float.floatToIntBits(f));
        }

        @Override // i3b.e
        public final boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends e {
        @Override // i3b.e
        public final boolean c(long j, Object obj) {
            return this.a.getBoolean(obj, j);
        }

        @Override // i3b.e
        public final double d(long j, Object obj) {
            return this.a.getDouble(obj, j);
        }

        @Override // i3b.e
        public final float e(long j, Object obj) {
            return this.a.getFloat(obj, j);
        }

        @Override // i3b.e
        public final void j(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // i3b.e
        public final void k(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // i3b.e
        public final void l(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // i3b.e
        public final void m(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // i3b.e
        public final boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                i3b.a(th);
                return false;
            }
        }

        @Override // i3b.e
        public final boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (i3b.g() != null) {
                        try {
                            Class<?> cls3 = this.a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            i3b.a(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    i3b.a(th2);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e {
        public final Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(long j, Object obj);

        public abstract double d(long j, Object obj);

        public abstract float e(long j, Object obj);

        public final int f(long j, Object obj) {
            return this.a.getInt(obj, j);
        }

        public final long g(long j, Object obj) {
            return this.a.getLong(obj, j);
        }

        public final Object h(long j, Object obj) {
            return this.a.getObject(obj, j);
        }

        public final long i(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j, boolean z);

        public abstract void k(Object obj, long j, byte b);

        public abstract void l(Object obj, long j, double d);

        public abstract void m(Object obj, long j, float f);

        public final void n(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void o(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void p(long j, Object obj, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                i3b.a(th);
                return false;
            }
        }

        public abstract boolean r();
    }

    static {
        Unsafe unsafeI = i();
        a = unsafeI;
        b = bk.a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        e dVar = null;
        if (unsafeI != null) {
            if (!bk.a()) {
                dVar = new d(unsafeI);
            } else if (zH) {
                dVar = new c(unsafeI);
            } else if (zH2) {
                dVar = new b(unsafeI);
            }
        }
        c = dVar;
        d = dVar == null ? false : dVar.r();
        e = dVar == null ? false : dVar.q();
        f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && dVar != null) {
            dVar.i(fieldG);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i3b.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static <T> T d(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class<?> cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (bk.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class<?> cls) {
        if (!bk.a()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        c.k(bArr, f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iF = c.f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(obj, j2, ((255 & b2) << i) | (iF & (~(255 << i))));
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(obj, j2, ((255 & b2) << i) | (c.f(j2, obj) & (~(255 << i))));
    }

    public static void m(Object obj, long j, int i) {
        c.n(obj, j, i);
    }

    public static void n(Object obj, long j, long j2) {
        c.o(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        c.p(j, obj, obj2);
    }
}
