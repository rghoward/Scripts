package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ak0 implements r02<Object>, w72, Serializable {
    private final r02<Object> completion;

    public ak0(r02<Object> r02Var) {
        this.completion = r02Var;
    }

    public r02<g2b> create(r02<?> r02Var) {
        r02Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.w72
    public w72 getCallerFrame() {
        r02<Object> r02Var = this.completion;
        if (r02Var instanceof w72) {
            return (w72) r02Var;
        }
        return null;
    }

    public final r02<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        xm2 xm2Var = (xm2) getClass().getAnnotation(xm2.class);
        String str = null;
        if (xm2Var == null || xm2Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? xm2Var.l()[iIntValue] : -1;
        wx6.a aVar = wx6.b;
        wx6.a aVar2 = wx6.a;
        if (aVar == null) {
            try {
                wx6.a aVar3 = new wx6.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                wx6.b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                wx6.b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = aVar.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVar.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = xm2Var.c();
        } else {
            strC = str + '/' + xm2Var.c();
        }
        return new StackTraceElement(strC, xm2Var.m(), xm2Var.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            ak0 ak0Var = (ak0) r2;
            r02<Object> r02Var = ak0Var.completion;
            r02Var.getClass();
            try {
                obj = ak0Var.invokeSuspend(obj);
                if (obj == v72.t) {
                    return;
                }
            } catch (Throwable th) {
                obj = new av8.a(th);
            }
            ak0Var.releaseIntercepted();
            if (!(r02Var instanceof ak0)) {
                r02Var.resumeWith(obj);
                return;
            }
            r2 = r02Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public r02<g2b> create(Object obj, r02<?> r02Var) {
        r02Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
