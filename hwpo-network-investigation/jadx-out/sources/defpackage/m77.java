package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m77<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final b Companion = new b();
    public static final m77<Integer> IntType = new yf5(false);
    public static final m77<Integer> ReferenceType = new a(false);
    public static final m77<int[]> IntArrayType = new pf5(true);
    public static final m77<List<Integer>> IntListType = new wf5(true);
    public static final m77<Long> LongType = new me6(false);
    public static final m77<long[]> LongArrayType = new he6(true);
    public static final m77<List<Long>> LongListType = new ke6(true);
    public static final m77<Float> FloatType = new u44(false);
    public static final m77<float[]> FloatArrayType = new p44(true);
    public static final m77<List<Float>> FloatListType = new t44(true);
    public static final m77<Boolean> BoolType = new tr0(false);
    public static final m77<boolean[]> BoolArrayType = new rr0(true);
    public static final m77<List<Boolean>> BoolListType = new sr0(true);
    public static final m77<String> StringType = new l2a(true);
    public static final m77<String[]> StringArrayType = new e2a(true);
    public static final m77<List<String>> StringListType = new i2a(true);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m77<Integer> {
        @Override // defpackage.m77
        public final Integer get(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return Integer.valueOf(wx.b(bundle, str));
        }

        @Override // defpackage.m77
        public final String getName() {
            return "reference";
        }

        @Override // defpackage.m77
        public final Integer parseValue(String str) {
            int i;
            str.getClass();
            if (w2a.n(str, "0x", false)) {
                String strSubstring = str.substring(2);
                ta1.a(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        @Override // defpackage.m77
        public final void put(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            bundle.getClass();
            str.getClass();
            bundle.putInt(str, iIntValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static m77 a(String str, String str2) {
            m77 m77Var = m77.IntType;
            if (!xj5.a(m77Var.getName(), str)) {
                m77Var = m77.IntArrayType;
                if (!xj5.a(m77Var.getName(), str)) {
                    m77Var = m77.IntListType;
                    if (!xj5.a(m77Var.getName(), str)) {
                        m77Var = m77.LongType;
                        if (!xj5.a(m77Var.getName(), str)) {
                            m77Var = m77.LongArrayType;
                            if (!xj5.a(m77Var.getName(), str)) {
                                m77Var = m77.LongListType;
                                if (!xj5.a(m77Var.getName(), str)) {
                                    m77Var = m77.BoolType;
                                    if (!xj5.a(m77Var.getName(), str)) {
                                        m77Var = m77.BoolArrayType;
                                        if (!xj5.a(m77Var.getName(), str)) {
                                            m77Var = m77.BoolListType;
                                            if (!xj5.a(m77Var.getName(), str)) {
                                                m77Var = m77.StringType;
                                                if (!xj5.a(m77Var.getName(), str)) {
                                                    m77Var = m77.StringArrayType;
                                                    if (!xj5.a(m77Var.getName(), str)) {
                                                        m77Var = m77.StringListType;
                                                        if (!xj5.a(m77Var.getName(), str)) {
                                                            m77Var = m77.FloatType;
                                                            if (!xj5.a(m77Var.getName(), str)) {
                                                                m77Var = m77.FloatArrayType;
                                                                if (!xj5.a(m77Var.getName(), str)) {
                                                                    m77Var = m77.FloatListType;
                                                                    if (!xj5.a(m77Var.getName(), str)) {
                                                                        m77Var = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (m77Var != null) {
                return m77Var;
            }
            m77<Integer> m77Var2 = m77.ReferenceType;
            if (xj5.a(m77Var2.getName(), str)) {
                return m77Var2;
            }
            if (str == null || str.length() == 0) {
                return m77.StringType;
            }
            try {
                String strConcat = (!w2a.n(str, ".", false) || str2 == null) ? str : str2.concat(str);
                boolean zH = w2a.h(str, "[]", false);
                if (zH) {
                    strConcat = strConcat.substring(0, strConcat.length() - 2);
                }
                m77 m77VarC = c(Class.forName(strConcat), zH);
                if (m77VarC != null) {
                    return m77VarC;
                }
                throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e) {
                d55.a(e);
                return null;
            }
        }

        public static m77 b(Object obj) {
            m77 m77Var;
            if (obj instanceof Integer) {
                m77Var = m77.IntType;
                m77Var.getClass();
            } else if (obj instanceof int[]) {
                m77Var = m77.IntArrayType;
                m77Var.getClass();
            } else if (obj instanceof Long) {
                m77Var = m77.LongType;
                m77Var.getClass();
            } else if (obj instanceof long[]) {
                m77Var = m77.LongArrayType;
                m77Var.getClass();
            } else if (obj instanceof Float) {
                m77Var = m77.FloatType;
                m77Var.getClass();
            } else if (obj instanceof float[]) {
                m77Var = m77.FloatArrayType;
                m77Var.getClass();
            } else if (obj instanceof Boolean) {
                m77Var = m77.BoolType;
                m77Var.getClass();
            } else if (obj instanceof boolean[]) {
                m77Var = m77.BoolArrayType;
                m77Var.getClass();
            } else if ((obj instanceof String) || obj == null) {
                m77Var = m77.StringType;
                m77Var.getClass();
            } else {
                m77Var = null;
            }
            if (m77Var != null) {
                return m77Var;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                m77<String[]> m77Var2 = m77.StringArrayType;
                m77Var2.getClass();
                return m77Var2;
            }
            obj.getClass();
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    componentType2.getClass();
                    return new d(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                componentType3.getClass();
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    componentType4.getClass();
                    return new f(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new e(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new c(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new g(obj.getClass());
            }
            z.b(obj.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
            return null;
        }

        public static m77 c(Class cls, boolean z) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z ? new d(cls) : new e(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z) {
                return new c(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z ? new f(cls) : new g(cls);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<D extends Enum<?>> extends g<D> {
        public final Class<D> b;

        public c(Class<D> cls) {
            super(0, cls);
            if (cls.isEnum()) {
                this.b = cls;
            } else {
                li.c(cls, " is not an Enum type.");
                throw null;
            }
        }

        @Override // m77.g, defpackage.m77
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D parseValue(String str) {
            D d;
            str.getClass();
            Class<D> cls = this.b;
            D[] enumConstants = cls.getEnumConstants();
            enumConstants.getClass();
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (w2a.i(d.name(), str, true)) {
                    break;
                }
                i++;
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            StringBuilder sbA = aa.a("Enum value ", str, " not found for type ");
            sbA.append(cls.getName());
            sbA.append('.');
            throw new IllegalArgumentException(sbA.toString());
        }

        @Override // m77.g, defpackage.m77
        public final String getName() {
            return this.b.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<D extends Parcelable> extends m77<D[]> {
        public final Class<D[]> a;

        public d(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                li.c(cls, " does not implement Parcelable.");
                throw null;
            }
            try {
                this.a = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                d55.a(e);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            return xj5.a(this.a, ((d) obj).a);
        }

        @Override // defpackage.m77
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (Parcelable[]) bundle.get(str);
        }

        @Override // defpackage.m77
        public final String getName() {
            return this.a.getName();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.m77
        public final Object parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.m77
        public final void put(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            bundle.getClass();
            str.getClass();
            this.a.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        @Override // defpackage.m77
        public final boolean valueEquals(Object obj, Object obj2) {
            return gz3.c((Parcelable[]) obj, (Parcelable[]) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e<D> extends m77<D> {
        public final Class<D> a;

        public e(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.a = cls;
            } else {
                li.c(cls, " does not implement Parcelable or Serializable.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !e.class.equals(obj.getClass())) {
                return false;
            }
            return xj5.a(this.a, ((e) obj).a);
        }

        @Override // defpackage.m77
        public final D get(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (D) bundle.get(str);
        }

        @Override // defpackage.m77
        public final String getName() {
            return this.a.getName();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.m77
        public final D parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // defpackage.m77
        public final void put(Bundle bundle, String str, D d) {
            bundle.getClass();
            str.getClass();
            this.a.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f<D extends Serializable> extends m77<D[]> {
        public final Class<D[]> a;

        public f(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                li.c(cls, " does not implement Serializable.");
                throw null;
            }
            try {
                this.a = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                d55.a(e);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !f.class.equals(obj.getClass())) {
                return false;
            }
            return xj5.a(this.a, ((f) obj).a);
        }

        @Override // defpackage.m77
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (Serializable[]) bundle.get(str);
        }

        @Override // defpackage.m77
        public final String getName() {
            return this.a.getName();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.m77
        public final Object parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // defpackage.m77
        public final void put(Bundle bundle, String str, Object obj) {
            ?? r3 = (Serializable[]) obj;
            bundle.getClass();
            str.getClass();
            this.a.cast(r3);
            bundle.putSerializable(str, r3);
        }

        @Override // defpackage.m77
        public final boolean valueEquals(Object obj, Object obj2) {
            return gz3.c((Serializable[]) obj, (Serializable[]) obj2);
        }
    }

    public m77(boolean z) {
        this.isNullableAllowed = z;
    }

    public static m77<?> fromArgType(String str, String str2) {
        b bVar = Companion;
        if (str != null && str.startsWith("java")) {
            try {
                String strConcat = "j$".concat(str.substring(4));
                bVar.getClass();
                return b.a(strConcat, str2);
            } catch (RuntimeException e2) {
                if (!(e2.getCause() instanceof ClassNotFoundException)) {
                    throw e2;
                }
            }
        }
        bVar.getClass();
        return b.a(str, str2);
    }

    public static final m77<Object> inferFromValue(String str) {
        Companion.getClass();
        str.getClass();
        try {
            try {
                try {
                    try {
                        m77<Integer> m77Var = IntType;
                        m77Var.parseValue(str);
                        return m77Var;
                    } catch (IllegalArgumentException unused) {
                        m77<Float> m77Var2 = FloatType;
                        m77Var2.parseValue(str);
                        return m77Var2;
                    }
                } catch (IllegalArgumentException unused2) {
                    m77<Long> m77Var3 = LongType;
                    m77Var3.parseValue(str);
                    return m77Var3;
                }
            } catch (IllegalArgumentException unused3) {
                m77<String> m77Var4 = StringType;
                m77Var4.getClass();
                return m77Var4;
            }
        } catch (IllegalArgumentException unused4) {
            m77<Boolean> m77Var5 = BoolType;
            m77Var5.parseValue(str);
            return m77Var5;
        }
    }

    public static final m77<Object> inferFromValueType(Object obj) {
        Companion.getClass();
        return b.b(obj);
    }

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final T parseAndPut(Bundle bundle, String str, String str2, T t) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str)) {
            z90.a("There is no previous value in this savedState.");
            return null;
        }
        if (str2 == null) {
            return t;
        }
        T value = parseValue(str2, t);
        put(bundle, str, value);
        return value;
    }

    public abstract T parseValue(String str);

    public T parseValue(String str, T t) {
        str.getClass();
        return parseValue(str);
    }

    public abstract void put(Bundle bundle, String str, T t);

    public String serializeAsValue(T t) {
        return String.valueOf(t);
    }

    public String toString() {
        return getName();
    }

    public boolean valueEquals(T t, T t2) {
        return xj5.a(t, t2);
    }

    public final T parseAndPut(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        str2.getClass();
        T value = parseValue(str2);
        put(bundle, str, value);
        return value;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g<D extends Serializable> extends m77<D> {
        public final Class<D> a;

        public g(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                li.c(cls, " does not implement Serializable.");
                throw null;
            }
            if (cls.isEnum()) {
                li.c(cls, " is an Enum. You should use EnumType instead.");
                throw null;
            }
            this.a = cls;
        }

        @Override // defpackage.m77
        /* JADX INFO: renamed from: a */
        public D parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return xj5.a(this.a, ((g) obj).a);
        }

        @Override // defpackage.m77
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (Serializable) bundle.get(str);
        }

        @Override // defpackage.m77
        public String getName() {
            return this.a.getName();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.m77
        public final void put(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            bundle.getClass();
            str.getClass();
            serializable.getClass();
            this.a.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public g(int i, Class cls) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.a = cls;
            } else {
                li.c(cls, " does not implement Serializable.");
                throw null;
            }
        }
    }
}
