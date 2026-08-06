package defpackage;

import defpackage.ek4;
import ek4.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ek4<MessageType extends ek4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends z1<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ek4<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected s2b unknownFields = s2b.f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<MessageType extends ek4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends z1.a<MessageType, BuilderType> {
        public final MessageType t;
        public MessageType u;

        public a(MessageType messagetype) {
            this.t = messagetype;
            if (messagetype.l()) {
                z90.a("Default instance must be immutable.");
                throw null;
            }
            this.u = (MessageType) messagetype.n();
        }

        public final Object clone() {
            a aVar = (a) this.t.h(f.x);
            aVar.u = (MessageType) f();
            return aVar;
        }

        public final MessageType e() {
            MessageType messagetype = (MessageType) f();
            messagetype.getClass();
            if (ek4.k(messagetype, true)) {
                return messagetype;
            }
            throw new b2b();
        }

        public final MessageType f() {
            boolean zL = this.u.l();
            MessageType messagetype = this.u;
            if (!zL) {
                return messagetype;
            }
            messagetype.getClass();
            ye8 ye8Var = ye8.c;
            ye8Var.getClass();
            ye8Var.a(messagetype.getClass()).b(messagetype);
            messagetype.m();
            return this.u;
        }

        public final void g() {
            if (this.u.l()) {
                return;
            }
            MessageType messagetype = (MessageType) this.t.n();
            MessageType messagetype2 = this.u;
            ye8 ye8Var = ye8.c;
            ye8Var.getClass();
            ye8Var.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.u = messagetype;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<T extends ek4<T, ?>> extends h2<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends ek4<MessageType, BuilderType> implements cu6 {
        protected su3<d> extensions = su3.d;

        @Override // defpackage.ek4, defpackage.cu6
        public final ek4 a() {
            return (ek4) h(f.y);
        }

        @Override // defpackage.ek4, defpackage.au6
        public final a c() {
            return (a) h(f.x);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements su3.a<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // su3.a
        public final iob q() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e<ContainingType extends au6, Type> extends ln4 {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public static final f t;
        public static final f u;
        public static final f v;
        public static final f w;
        public static final f x;
        public static final f y;
        public static final /* synthetic */ f[] z;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            t = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            u = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            v = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            w = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            x = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            y = fVar6;
            z = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f("GET_PARSER", 6)};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) z.clone();
        }
    }

    public static <T extends ek4<?, ?>> T i(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((ek4) i3b.d(cls)).h(f.y);
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        d43.c();
        return null;
    }

    public static Object j(Method method, ek4 ek4Var, Object... objArr) {
        try {
            return method.invoke(ek4Var, objArr);
        } catch (IllegalAccessException e2) {
            jl.a("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
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

    public static final <T extends ek4<T, ?>> boolean k(T t, boolean z) {
        byte bByteValue = ((Byte) t.h(f.t)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ye8 ye8Var = ye8.c;
        ye8Var.getClass();
        boolean zC = ye8Var.a(t.getClass()).c(t);
        if (z) {
            t.h(f.u);
        }
        return zC;
    }

    public static <T extends ek4<?, ?>> void o(Class<T> cls, T t) {
        t.m();
        defaultInstanceMap.put(cls, t);
    }

    @Override // defpackage.cu6
    public ek4 a() {
        return (ek4) h(f.y);
    }

    @Override // defpackage.au6
    public final int b() {
        return f(null);
    }

    @Override // defpackage.au6
    public a c() {
        return (a) h(f.x);
    }

    @Override // defpackage.au6
    public final void d(sg1 sg1Var) {
        ye8 ye8Var = ye8.c;
        ye8Var.getClass();
        w49 w49VarA = ye8Var.a(getClass());
        vg1 vg1Var = sg1Var.x;
        if (vg1Var == null) {
            vg1Var = new vg1(sg1Var);
        }
        w49VarA.i(this, vg1Var);
    }

    @Override // defpackage.z1
    public final int e() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ye8 ye8Var = ye8.c;
        ye8Var.getClass();
        return ye8Var.a(getClass()).e(this, (ek4) obj);
    }

    @Override // defpackage.z1
    public final int f(w49 w49Var) {
        int iH;
        int iH2;
        if (l()) {
            if (w49Var == null) {
                ye8 ye8Var = ye8.c;
                ye8Var.getClass();
                iH2 = ye8Var.a(getClass()).h(this);
            } else {
                iH2 = w49Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            aa0.c(pp2.a(iH2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (e() != Integer.MAX_VALUE) {
            return e();
        }
        if (w49Var == null) {
            ye8 ye8Var2 = ye8.c;
            ye8Var2.getClass();
            iH = ye8Var2.a(getClass()).h(this);
        } else {
            iH = w49Var.h(this);
        }
        g(iH);
        return iH;
    }

    @Override // defpackage.z1
    public final void g(int i) {
        if (i < 0) {
            aa0.c(pp2.a(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public abstract Object h(f fVar);

    public final int hashCode() {
        if (l()) {
            ye8 ye8Var = ye8.c;
            ye8Var.getClass();
            return ye8Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            ye8 ye8Var2 = ye8.c;
            ye8Var2.getClass();
            this.memoizedHashCode = ye8Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean l() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void m() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MessageType n() {
        return (MessageType) h(f.w);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = eu6.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        eu6.c(this, sb, 0);
        return sb.toString();
    }
}
