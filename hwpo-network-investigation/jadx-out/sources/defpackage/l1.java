package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.AttributeType;
import java.util.NoSuchElementException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends j47 implements em5 {
    public final sl5 v;
    public final String w;
    public final xl5 x;

    public l1(sl5 sl5Var, JsonElement jsonElement, String str) {
        this.v = sl5Var;
        this.w = str;
        this.x = sl5Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0096  */
    @Override // kotlinx.serialization.encoding.Decoder
    public final <T> T C(sy2<? extends T> sy2Var) {
        String strD;
        sy2Var.getClass();
        if (!(sy2Var instanceof l2)) {
            return sy2Var.deserialize(this);
        }
        sl5 sl5Var = this.v;
        xl5 xl5Var = sl5Var.a;
        l2 l2Var = (l2) sy2Var;
        String strA = q58.a(sl5Var, l2Var.getDescriptor());
        JsonElement jsonElementT = t();
        String strA2 = l2Var.getDescriptor().a();
        if (!(jsonElementT instanceof JsonObject)) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonObject.class).c() + ", but had " + ll8.a(jsonElementT.getClass()).c() + " as the serialized body of " + strA2, r(), null, sl5Var.a.i ? ha7.h(jsonElementT.toString(), -1).toString() : null, -1));
        }
        JsonObject jsonObject = (JsonObject) jsonElementT;
        JsonElement jsonElement = (JsonElement) jsonObject.get(strA);
        if (jsonElement != null) {
            JsonPrimitive jsonPrimitiveC = hm5.c(jsonElement);
            if (jsonPrimitiveC instanceof JsonNull) {
                strD = null;
            } else {
                strD = jsonPrimitiveC.d();
            }
        } else {
            strD = null;
        }
        try {
            return (T) aa7.a(sl5Var, strA, jsonObject, sm3.f((l2) sy2Var, this, strD));
        } catch (td9 e) {
            String message = e.getMessage();
            message.getClass();
            throw new gm5(ha7.d(message, null, null, sl5Var.a.i ? ha7.h(jsonObject.toString(), -1).toString() : null, -1));
        }
    }

    @Override // defpackage.em5
    public final JsonElement M() {
        return t();
    }

    @Override // defpackage.j47
    public final boolean a(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        if (!(jsonElementS instanceof JsonPrimitive)) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of boolean", w(str), null, this.v.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            pc5 pc5Var = hm5.a;
            String strD = jsonPrimitive.d();
            String[] strArr = m2a.a;
            strD.getClass();
            if (strD.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strD.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            x(jsonPrimitive, AttributeType.BOOLEAN, str);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, AttributeType.BOOLEAN, str);
            throw null;
        }
    }

    @Override // defpackage.j47
    public final byte b(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        if (!(jsonElementS instanceof JsonPrimitive)) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of byte", w(str), null, this.v.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            long jD = hm5.d(jsonPrimitive);
            Byte bValueOf = (-128 > jD || jD > 127) ? null : Byte.valueOf((byte) jD);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            x(jsonPrimitive, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, "byte", str);
            throw null;
        }
    }

    @Override // defpackage.j47
    public final char c(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        if (!(jsonElementS instanceof JsonPrimitive)) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of char", w(str), null, this.v.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            String strD = jsonPrimitive.d();
            strD.getClass();
            int length = strD.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strD.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, "char", str);
            throw null;
        }
    }

    @Override // defpackage.j47
    public final double d(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        boolean z = jsonElementS instanceof JsonPrimitive;
        sl5 sl5Var = this.v;
        if (!z) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of double", w(str), null, sl5Var.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            pc5 pc5Var = hm5.a;
            double d = Double.parseDouble(jsonPrimitive.d());
            xl5 xl5Var = sl5Var.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new gm5(ha7.d(ha7.i(str, Double.valueOf(d)), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", sl5Var.a.i ? ha7.h(t().toString(), -1).toString() : null, -1));
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, "double", str);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean d0() {
        return !(t() instanceof JsonNull);
    }

    @Override // defpackage.j47
    public final int e(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        JsonElement jsonElementS = s(str);
        String strA = serialDescriptor.a();
        boolean z = jsonElementS instanceof JsonPrimitive;
        sl5 sl5Var = this.v;
        if (z) {
            return ym5.b(serialDescriptor, sl5Var, ((JsonPrimitive) jsonElementS).d(), BuildConfig.FLAVOR);
        }
        throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of " + strA, w(str), null, sl5Var.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.j47
    public final float f(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        boolean z = jsonElementS instanceof JsonPrimitive;
        sl5 sl5Var = this.v;
        if (!z) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of float", w(str), null, sl5Var.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            pc5 pc5Var = hm5.a;
            float f = Float.parseFloat(jsonPrimitive.d());
            xl5 xl5Var = sl5Var.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new gm5(ha7.d(ha7.i(str, Float.valueOf(f)), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", sl5Var.a.i ? ha7.h(t().toString(), -1).toString() : null, -1));
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, AttributeType.FLOAT, str);
            throw null;
        }
    }

    @Override // defpackage.j47
    public final Decoder g(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!z1a.a(serialDescriptor)) {
            this.t.add(str);
            return this;
        }
        JsonElement jsonElementS = s(str);
        String strA = serialDescriptor.a();
        boolean z = jsonElementS instanceof JsonPrimitive;
        sl5 sl5Var = this.v;
        if (z) {
            return new fm5(th0.c(sl5Var, ((JsonPrimitive) jsonElementS).d()), sl5Var);
        }
        throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of " + strA, w(str), null, sl5Var.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.j47
    public final int h(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        if (!(jsonElementS instanceof JsonPrimitive)) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of int", w(str), null, this.v.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            long jD = hm5.d(jsonPrimitive);
            Integer numValueOf = (-2147483648L > jD || jD > 2147483647L) ? null : Integer.valueOf((int) jD);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            x(jsonPrimitive, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, "int", str);
            throw null;
        }
    }

    public void i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.j47
    public final long j(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        if (jsonElementS instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
            try {
                return hm5.d(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                x(jsonPrimitive, "long", str);
                throw null;
            }
        }
        throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of long", w(str), null, this.v.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.rt1
    public final ln4 k() {
        return this.v.b;
    }

    @Override // defpackage.j47
    public final short l(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        if (!(jsonElementS instanceof JsonPrimitive)) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of short", w(str), null, this.v.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        try {
            long jD = hm5.d(jsonPrimitive);
            Short shValueOf = (-32768 > jD || jD > 32767) ? null : Short.valueOf((short) jD);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            x(jsonPrimitive, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(jsonPrimitive, "short", str);
            throw null;
        }
    }

    @Override // defpackage.em5
    public final sl5 l0() {
        return this.v;
    }

    @Override // defpackage.j47
    public final String m(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementS = s(str);
        boolean z = jsonElementS instanceof JsonPrimitive;
        sl5 sl5Var = this.v;
        if (!z) {
            throw new gm5(ha7.d("Expected " + ll8.a(JsonPrimitive.class).c() + ", but had " + ll8.a(jsonElementS.getClass()).c() + " as the serialized body of string", w(str), null, sl5Var.a.i ? ha7.h(jsonElementS.toString(), -1).toString() : null, -1));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementS;
        if (!(jsonPrimitive instanceof um5)) {
            throw new gm5(ha7.d(sk0.c("Expected string value for a non-null key '", str, "', got null literal instead"), w(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", sl5Var.a.i ? ha7.h(t().toString(), -1).toString() : null, -1));
        }
        um5 um5Var = (um5) jsonPrimitive;
        if (um5Var.t || sl5Var.a.b) {
            return um5Var.u;
        }
        throw new gm5(ha7.d(sk0.c("String literal for value of key '", str, "' should be quoted"), w(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", sl5Var.a.i ? ha7.h(t().toString(), -1).toString() : null, -1));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public rt1 n(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        JsonElement jsonElementT = t();
        pd9 pd9VarE = serialDescriptor.e();
        boolean zA = xj5.a(pd9VarE, g3a.b.a);
        sl5 sl5Var = this.v;
        if (zA || (pd9VarE instanceof p58)) {
            String strA = serialDescriptor.a();
            if (jsonElementT instanceof JsonArray) {
                return new in5(sl5Var, (JsonArray) jsonElementT);
            }
            throw new gm5(ha7.d("Expected " + ll8.a(JsonArray.class).c() + ", but had " + ll8.a(jsonElementT.getClass()).c() + " as the serialized body of " + strA, r(), null, sl5Var.a.i ? ha7.h(jsonElementT.toString(), -1).toString() : null, -1));
        }
        if (!xj5.a(pd9VarE, g3a.c.a)) {
            String strA2 = serialDescriptor.a();
            if (jsonElementT instanceof JsonObject) {
                return new hn5(sl5Var, (JsonObject) jsonElementT, this.w, 8);
            }
            throw new gm5(ha7.d("Expected " + ll8.a(JsonObject.class).c() + ", but had " + ll8.a(jsonElementT.getClass()).c() + " as the serialized body of " + strA2, r(), null, sl5Var.a.i ? ha7.h(jsonElementT.toString(), -1).toString() : null, -1));
        }
        SerialDescriptor serialDescriptorA = arb.a(serialDescriptor.i(0), sl5Var.b);
        pd9 pd9VarE2 = serialDescriptorA.e();
        if ((pd9VarE2 instanceof j98) || xj5.a(pd9VarE2, pd9.b.a)) {
            String strA3 = serialDescriptor.a();
            if (jsonElementT instanceof JsonObject) {
                return new jn5(sl5Var, (JsonObject) jsonElementT);
            }
            throw new gm5(ha7.d("Expected " + ll8.a(JsonObject.class).c() + ", but had " + ll8.a(jsonElementT.getClass()).c() + " as the serialized body of " + strA3, r(), null, sl5Var.a.i ? ha7.h(jsonElementT.toString(), -1).toString() : null, -1));
        }
        if (!sl5Var.a.c) {
            throw ha7.c(serialDescriptorA);
        }
        String strA4 = serialDescriptor.a();
        if (jsonElementT instanceof JsonArray) {
            return new in5(sl5Var, (JsonArray) jsonElementT);
        }
        throw new gm5(ha7.d("Expected " + ll8.a(JsonArray.class).c() + ", but had " + ll8.a(jsonElementT.getClass()).c() + " as the serialized body of " + strA4, r(), null, sl5Var.a.i ? ha7.h(jsonElementT.toString(), -1).toString() : null, -1));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder n0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (th1.H(this.t) != null) {
            return g(q(), serialDescriptor);
        }
        return new dn5(this.v, v(), this.w).n0(serialDescriptor);
    }

    public abstract JsonElement s(String str);

    public final JsonElement t() {
        JsonElement jsonElementS;
        String str = (String) th1.H(this.t);
        return (str == null || (jsonElementS = s(str)) == null) ? v() : jsonElementS;
    }

    public abstract JsonElement v();

    public final String w(String str) {
        str.getClass();
        return r() + '.' + str;
    }

    public final void x(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw new gm5(ha7.d("Failed to parse literal '" + jsonPrimitive + "' as " + (w2a.n(str, "i", false) ? "an " : "a ").concat(str) + " value", w(str2), null, this.v.a.i ? ha7.h(t().toString(), -1).toString() : null, -1));
    }
}
