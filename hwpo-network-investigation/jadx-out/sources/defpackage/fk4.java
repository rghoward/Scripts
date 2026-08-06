package defpackage;

import defpackage.fk4;
import fk4.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fk4<MessageType extends fk4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a2<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, fk4<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected r2b unknownFields = r2b.f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<MessageType extends fk4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a2.a<MessageType, BuilderType> {
        public final MessageType t;
        public MessageType u;

        public a(MessageType messagetype) {
            this.t = messagetype;
            if (messagetype.s()) {
                z90.a("Default instance must be immutable.");
                throw null;
            }
            this.u = (MessageType) messagetype.v();
        }

        public final Object clone() {
            a aVar = (a) this.t.p(e.x);
            aVar.u = (MessageType) m();
            return aVar;
        }

        public final MessageType l() {
            MessageType messagetype = (MessageType) m();
            messagetype.getClass();
            byte bByteValue = ((Byte) messagetype.p(e.t)).byteValue();
            boolean zC = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zC = false;
                } else {
                    xe8 xe8Var = xe8.c;
                    xe8Var.getClass();
                    zC = xe8Var.a(messagetype.getClass()).c(messagetype);
                    messagetype.p(e.u);
                }
            }
            if (zC) {
                return messagetype;
            }
            throw new a2b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }

        public final MessageType m() {
            boolean zS = this.u.s();
            MessageType messagetype = this.u;
            if (!zS) {
                return messagetype;
            }
            messagetype.getClass();
            xe8 xe8Var = xe8.c;
            xe8Var.getClass();
            xe8Var.a(messagetype.getClass()).b(messagetype);
            messagetype.t();
            return this.u;
        }

        public final void n() {
            if (this.u.s()) {
                return;
            }
            MessageType messagetype = (MessageType) this.t.v();
            MessageType messagetype2 = this.u;
            xe8 xe8Var = xe8.c;
            xe8Var.getClass();
            xe8Var.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.u = messagetype;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<T extends fk4<T, ?>> extends g2<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends fk4<MessageType, BuilderType> implements bu6 {
        protected tu3<d> extensions = tu3.d;

        @Override // defpackage.fk4, defpackage.bu6
        public final fk4 a() {
            return (fk4) p(e.y);
        }

        @Override // defpackage.fk4, defpackage.zt6
        public final a c() {
            return (a) p(e.x);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements tu3.a<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // tu3.a
        public final hob q() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e t;
        public static final e u;
        public static final e v;
        public static final e w;
        public static final e x;
        public static final e y;
        public static final /* synthetic */ e[] z;

        static {
            e eVar = new e("GET_MEMOIZED_IS_INITIALIZED", 0);
            t = eVar;
            e eVar2 = new e("SET_MEMOIZED_IS_INITIALIZED", 1);
            u = eVar2;
            e eVar3 = new e("BUILD_MESSAGE_INFO", 2);
            v = eVar3;
            e eVar4 = new e("NEW_MUTABLE_INSTANCE", 3);
            w = eVar4;
            e eVar5 = new e("NEW_BUILDER", 4);
            x = eVar5;
            e eVar6 = new e("GET_DEFAULT_INSTANCE", 5);
            y = eVar6;
            z = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, new e("GET_PARSER", 6)};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) z.clone();
        }
    }

    public static <T extends fk4<?, ?>> T q(Class<T> cls) {
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
        T t2 = (T) ((fk4) h3b.b(cls)).p(e.y);
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        d43.c();
        return null;
    }

    public static Object r(Method method, fk4 fk4Var, Object... objArr) {
        try {
            return method.invoke(fk4Var, objArr);
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

    public static <E> zi5.c<E> u(zi5.c<E> cVar) {
        int size = cVar.size();
        return cVar.h(size == 0 ? 10 : size * 2);
    }

    public static <T extends fk4<?, ?>> void w(Class<T> cls, T t) {
        t.t();
        defaultInstanceMap.put(cls, t);
    }

    @Override // defpackage.bu6
    public fk4 a() {
        return (fk4) p(e.y);
    }

    @Override // defpackage.zt6
    public final int b() {
        return m(null);
    }

    @Override // defpackage.zt6
    public a c() {
        return (a) p(e.x);
    }

    @Override // defpackage.zt6
    public final void e(tg1 tg1Var) {
        xe8 xe8Var = xe8.c;
        xe8Var.getClass();
        v49 v49VarA = xe8Var.a(getClass());
        ug1 ug1Var = tg1Var.x;
        if (ug1Var == null) {
            ug1Var = new ug1(tg1Var);
        }
        v49VarA.e(this, ug1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xe8 xe8Var = xe8.c;
        xe8Var.getClass();
        return xe8Var.a(getClass()).h(this, (fk4) obj);
    }

    public final int hashCode() {
        if (s()) {
            xe8 xe8Var = xe8.c;
            xe8Var.getClass();
            return xe8Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            xe8 xe8Var2 = xe8.c;
            xe8Var2.getClass();
            this.memoizedHashCode = xe8Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    @Override // defpackage.a2
    public final int l() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.a2
    public final int m(v49 v49Var) {
        int iG;
        int iG2;
        if (s()) {
            if (v49Var == null) {
                xe8 xe8Var = xe8.c;
                xe8Var.getClass();
                iG2 = xe8Var.a(getClass()).g(this);
            } else {
                iG2 = v49Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            aa0.c(pp2.a(iG2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (l() != Integer.MAX_VALUE) {
            return l();
        }
        if (v49Var == null) {
            xe8 xe8Var2 = xe8.c;
            xe8Var2.getClass();
            iG = xe8Var2.a(getClass()).g(this);
        } else {
            iG = v49Var.g(this);
        }
        n(iG);
        return iG;
    }

    @Override // defpackage.a2
    public final void n(int i) {
        if (i < 0) {
            aa0.c(pp2.a(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final <MessageType extends fk4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType o() {
        return (BuilderType) p(e.x);
    }

    public abstract Object p(e eVar);

    public final boolean s() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void t() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = du6.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        du6.c(this, sb, 0);
        return sb.toString();
    }

    public final MessageType v() {
        return (MessageType) p(e.w);
    }
}
