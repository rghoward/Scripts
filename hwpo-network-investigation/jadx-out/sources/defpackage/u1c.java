package defpackage;

import defpackage.p1c;
import defpackage.u1c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1c<MessageType extends u1c<MessageType, BuilderType>, BuilderType extends p1c<MessageType, BuilderType>> extends f0c<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected g4c zzc = g4c.f;

    public static u1c j(u1c u1cVar, byte[] bArr, f1c f1cVar) throws k2c {
        int length = bArr.length;
        if (length != 0) {
            u1c u1cVarM = u1cVar.m();
            try {
                t3c t3cVarA = q3c.c.a(u1cVarM.getClass());
                t3cVarA.g(u1cVarM, bArr, 0, length, new i0c(f1cVar));
                t3cVarA.f(u1cVarM);
                u1cVar = u1cVarM;
            } catch (b4c e) {
                throw e.a();
            } catch (IOException e2) {
                if (e2.getCause() instanceof k2c) {
                    throw ((k2c) e2.getCause());
                }
                throw new k2c(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (k2c e3) {
                if (e3.t) {
                    throw new k2c(e3.getMessage(), e3);
                }
                throw e3;
            }
        }
        v(u1cVar);
        return u1cVar;
    }

    public static u1c r(Class cls) {
        Map map = zze;
        u1c u1cVar = (u1c) map.get(cls);
        if (u1cVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                u1cVar = (u1c) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (u1cVar != null) {
            return u1cVar;
        }
        u1c u1cVar2 = (u1c) ((u1c) m4c.d(cls)).w(6);
        if (u1cVar2 != null) {
            map.put(cls, u1cVar2);
            return u1cVar2;
        }
        d43.c();
        return null;
    }

    public static void s(Class cls, u1c u1cVar) {
        u1cVar.l();
        zze.put(cls, u1cVar);
    }

    public static Object t(Method method, u1c u1cVar, Object... objArr) {
        try {
            return method.invoke(u1cVar, objArr);
        } catch (IllegalAccessException e) {
            jl.a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            jl.a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean u(u1c u1cVar, boolean z) {
        byte bByteValue = ((Byte) u1cVar.w(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = q3c.c.a(u1cVar.getClass()).d(u1cVar);
        if (z) {
            u1cVar.w(2);
        }
        return zD;
    }

    public static void v(u1c u1cVar) throws k2c {
        if (u1cVar != null && !u(u1cVar, true)) {
            throw new b4c().a();
        }
    }

    @Override // defpackage.h3c
    public final /* synthetic */ u1c a() {
        return (u1c) w(6);
    }

    @Override // defpackage.g3c
    public final void b(b1c b1cVar) {
        t3c t3cVarA = q3c.c.a(getClass());
        c1c c1cVar = b1cVar.a;
        if (c1cVar == null) {
            c1cVar = new c1c(b1cVar);
        }
        t3cVarA.b(this, c1cVar);
    }

    @Override // defpackage.g3c
    public final /* synthetic */ f3c c() {
        return (p1c) w(5);
    }

    @Override // defpackage.g3c
    public final o3c d() {
        return (o3c) w(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return q3c.c.a(getClass()).j(this, (u1c) obj);
    }

    @Override // defpackage.g3c
    public final int f() {
        if (k()) {
            int iE = q3c.c.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            r75.a(String.valueOf(iE).length() + 42, iE);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = q3c.c.a(getClass()).e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        r75.a(String.valueOf(iE2).length() + 42, iE2);
        return 0;
    }

    @Override // defpackage.f0c
    public final int h(t3c t3cVar) {
        if (k()) {
            int iE = t3cVar.e(this);
            if (iE >= 0) {
                return iE;
            }
            r75.a(String.valueOf(iE).length() + 42, iE);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = t3cVar.e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        r75.a(String.valueOf(iE2).length() + 42, iE2);
        return 0;
    }

    public final int hashCode() {
        if (k()) {
            return q3c.c.a(getClass()).h(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iH = q3c.c.a(getClass()).h(this);
        this.zza = iH;
        return iH;
    }

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final u1c m() {
        return (u1c) w(4);
    }

    public final void n() {
        q3c.c.a(getClass()).f(this);
        l();
    }

    public final p1c o() {
        return (p1c) w(5);
    }

    public final p1c p() {
        p1c p1cVar = (p1c) w(5);
        p1cVar.l(this);
        return p1cVar;
    }

    public final void q() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = i3c.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        i3c.b(this, sb, 0);
        return sb.toString();
    }

    public abstract Object w(int i);
}
