package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s21 implements vn5, Serializable {
    public static final Object NO_RECEIVER = a.t;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient vn5 reflected;
    private final String signature;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements Serializable {
        public static final a t = new a();
    }

    public s21(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.vn5
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.vn5
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public vn5 compute() {
        vn5 vn5Var = this.reflected;
        if (vn5Var != null) {
            return vn5Var;
        }
        vn5 vn5VarComputeReflected = computeReflected();
        this.reflected = vn5VarComputeReflected;
        return vn5VarComputeReflected;
    }

    public abstract vn5 computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        xn5 owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof qd1)) {
            return null;
        }
        String strO = z2a.O(signature, '(');
        if (strO.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((qd1) owner).a().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (xj5.a(method.getName(), strO)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    ch.a(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                ch.a(sb, returnType);
                if (sb.toString().equals(signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // defpackage.un5
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.vn5
    public String getName() {
        return this.name;
    }

    public xn5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ll8.a(cls);
        }
        ll8.a.getClass();
        return new zn7(cls);
    }

    @Override // defpackage.vn5
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public vn5 getReflected() {
        vn5 vn5VarCompute = compute();
        if (vn5VarCompute != this) {
            return vn5VarCompute;
        }
        throw new sp5("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // defpackage.vn5
    public io5 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.vn5
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.vn5
    public jo5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.vn5
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.vn5
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.vn5
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.vn5, defpackage.yn5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public s21(Object obj) {
        this(obj, null, null, null, false);
    }

    public s21() {
        this(NO_RECEIVER);
    }
}
