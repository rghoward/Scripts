package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ydb {
    public final n30<String, Method> a;
    public final n30<String, Method> b;
    public final n30<String, Class> c;

    public ydb(n30<String, Method> n30Var, n30<String, Method> n30Var2, n30<String, Class> n30Var3) {
        this.a = n30Var;
        this.b = n30Var2;
        this.c = n30Var3;
    }

    public abstract zdb a();

    public final Class b(Class<? extends aeb> cls) throws ClassNotFoundException {
        String name = cls.getName();
        n30<String, Class> n30Var = this.c;
        Class cls2 = n30Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        n30Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        n30<String, Method> n30Var = this.a;
        Method method = n30Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ydb.class.getClassLoader()).getDeclaredMethod("read", ydb.class);
        n30Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        n30<String, Method> n30Var = this.b;
        Method method = n30Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, ydb.class);
        n30Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i);

    public abstract int i();

    public abstract <T extends Parcelable> T j();

    public abstract String k();

    public final <T extends aeb> T l() {
        String strK = k();
        if (strK == null) {
            return null;
        }
        try {
            return (T) c(strK).invoke(null, a());
        } catch (ClassNotFoundException e) {
            jl.a("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            jl.a("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            jl.a("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            jl.a("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void m(int i);

    public abstract void n(boolean z);

    public abstract void o(byte[] bArr);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(Parcelable parcelable);

    public abstract void s(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(aeb aebVar) {
        if (aebVar == null) {
            s(null);
            return;
        }
        try {
            s(b(aebVar.getClass()).getName());
            zdb zdbVarA = a();
            try {
                d(aebVar.getClass()).invoke(null, aebVar, zdbVarA);
                zdbVarA.u();
            } catch (ClassNotFoundException e) {
                jl.a("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                jl.a("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                jl.a("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                jl.a("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            jl.a(aebVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
