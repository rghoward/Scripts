package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ws7<T> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends ws7<T> {
        public final Method a;
        public final int b;
        public final g52<T, qp8> c;

        public a(Method method, int i, g52<T, qp8> g52Var) {
            this.a = method;
            this.b = i;
            this.c = g52Var;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            int i = this.b;
            Method method = this.a;
            if (t == null) {
                throw s6b.j(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                sp8Var.k = this.c.a(t);
            } catch (IOException e) {
                throw s6b.k(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> extends ws7<T> {
        public final String a;
        public final py0.d b;
        public final boolean c;

        public b(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = py0.d.a;
            this.c = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            if (t == null) {
                return;
            }
            this.b.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            sp8Var.a(this.a, string, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> extends ws7<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public c(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw s6b.j(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw s6b.j(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw s6b.j(method, i, sk0.c("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw s6b.j(method, i, "Field map value '" + value + "' converted to null by " + py0.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                sp8Var.a(str, string, this.c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<T> extends ws7<T> {
        public final String a;
        public final py0.d b;
        public final boolean c;

        public d(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = py0.d.a;
            this.c = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            if (t == null) {
                return;
            }
            this.b.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            sp8Var.b(this.a, string, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e<T> extends ws7<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public e(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw s6b.j(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw s6b.j(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw s6b.j(method, i, sk0.c("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                sp8Var.b(str, value.toString(), this.c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends ws7<nu4> {
        public final Method a;
        public final int b;

        public f(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, nu4 nu4Var) {
            nu4 nu4Var2 = nu4Var;
            if (nu4Var2 == null) {
                throw s6b.j(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            nu4.a aVar = sp8Var.f;
            aVar.getClass();
            int size = nu4Var2.size();
            for (int i = 0; i < size; i++) {
                rtb.a(aVar, nu4Var2.e(i), nu4Var2.j(i));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g<T> extends ws7<T> {
        public final Method a;
        public final int b;
        public final nu4 c;
        public final g52<T, qp8> d;

        public g(Method method, int i, nu4 nu4Var, g52<T, qp8> g52Var) {
            this.a = method;
            this.b = i;
            this.c = nu4Var;
            this.d = g52Var;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            if (t == null) {
                return;
            }
            try {
                sp8Var.c(this.c, this.d.a(t));
            } catch (IOException e) {
                throw s6b.j(this.a, this.b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h<T> extends ws7<Map<String, T>> {
        public final Method a;
        public final int b;
        public final g52<T, qp8> c;
        public final String d;

        public h(Method method, int i, g52<T, qp8> g52Var, String str) {
            this.a = method;
            this.b = i;
            this.c = g52Var;
            this.d = str;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw s6b.j(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw s6b.j(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw s6b.j(method, i, sk0.c("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                String[] strArr = {"Content-Disposition", sk0.c("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d};
                nu4 nu4Var = nu4.u;
                sp8Var.c(nu4.b.a(strArr), this.c.a((T) value));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i<T> extends ws7<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final py0.d d;
        public final boolean e;

        public i(Method method, int i, String str, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = py0.d.a;
            this.e = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) throws EOFException {
            String strN;
            String str = this.c;
            if (t == null) {
                throw s6b.j(this.a, this.b, sk0.c("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            this.d.getClass();
            String string = t.toString();
            if (sp8Var.c == null) {
                throw new AssertionError();
            }
            int length = string.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strN = string;
                    break;
                }
                int iCodePointAt = string.codePointAt(iCharCount);
                boolean z = this.e;
                int i = 47;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    tx0 tx0Var = new tx0();
                    tx0Var.f0(0, iCharCount, string);
                    tx0 tx0Var2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = string.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != -1 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (tx0Var2 == null) {
                                    tx0Var2 = new tx0();
                                }
                                tx0Var2.j0(iCodePointAt2);
                                while (!tx0Var2.z()) {
                                    byte b = tx0Var2.readByte();
                                    int i2 = b & MessagePack.Code.EXT_TIMESTAMP;
                                    tx0Var.Z(37);
                                    char[] cArr = sp8.l;
                                    tx0Var.Z(cArr[(i2 >> 4) & 15]);
                                    tx0Var.Z(cArr[b & 15]);
                                }
                            } else {
                                tx0Var.j0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                    }
                    strN = tx0Var.N();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = sp8Var.c.replace("{" + str + "}", strN);
            if (sp8.m.matcher(strReplace).matches()) {
                z90.a("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
            } else {
                sp8Var.c = strReplace;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j<T> extends ws7<T> {
        public final String a;
        public final py0.d b;
        public final boolean c;

        public j(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = py0.d.a;
            this.c = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            if (t == null) {
                return;
            }
            this.b.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            sp8Var.d(this.a, string, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k<T> extends ws7<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public k(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw s6b.j(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw s6b.j(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw s6b.j(method, i, sk0.c("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw s6b.j(method, i, "Query map value '" + value + "' converted to null by " + py0.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                sp8Var.d(str, string, this.c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l<T> extends ws7<T> {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            if (t == null) {
                return;
            }
            sp8Var.d(t.toString(), null, this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends ws7<n17.c> {
        public static final m a = new m();

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, n17.c cVar) {
            n17.c cVar2 = cVar;
            if (cVar2 != null) {
                n17.a aVar = sp8Var.i;
                aVar.getClass();
                aVar.c.add(cVar2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends ws7<Object> {
        public final Method a;
        public final int b;

        public n(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, Object obj) {
            if (obj != null) {
                sp8Var.c = obj.toString();
            } else {
                throw s6b.j(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o<T> extends ws7<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // defpackage.ws7
        public final void a(sp8 sp8Var, T t) {
            jp8.a aVar = sp8Var.e;
            aVar.getClass();
            Class<T> cls = this.a;
            cls.getClass();
            aVar.e = aVar.e.U0(ll8.a(cls), t);
        }
    }

    public abstract void a(sp8 sp8Var, T t);
}
