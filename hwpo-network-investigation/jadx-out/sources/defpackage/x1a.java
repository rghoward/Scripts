package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1a extends ln4 implements em5 {
    public final ln4 A;
    public int B;
    public a C;
    public final xl5 D;
    public final im5 E;
    public final sl5 x;
    public final zqb y;
    public final h2a z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public String a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1a(sl5 sl5Var, zqb zqbVar, h2a h2aVar, SerialDescriptor serialDescriptor, a aVar) {
        super(1);
        serialDescriptor.getClass();
        this.x = sl5Var;
        this.y = zqbVar;
        this.z = h2aVar;
        this.A = sl5Var.b;
        this.B = -1;
        this.C = aVar;
        xl5 xl5Var = sl5Var.a;
        this.D = xl5Var;
        this.E = xl5Var.d ? null : new im5(serialDescriptor);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0143, please report this as an issue */
    @Override // kotlinx.serialization.encoding.Decoder
    public final <T> T C(sy2<? extends T> sy2Var) {
        String message;
        String strD;
        sl5 sl5Var = this.x;
        h2a h2aVar = this.z;
        cn5 cn5Var = h2aVar.c;
        sy2Var.getClass();
        try {
            if (!(sy2Var instanceof l2)) {
                return sy2Var.deserialize(this);
            }
            String strA = q58.a(sl5Var, ((l2) sy2Var).getDescriptor());
            String strP = h2aVar.p(strA, this.D.b);
            if (strP != null) {
                try {
                    sy2 sy2VarF = sm3.f((l2) sy2Var, this, strP);
                    a aVar = new a();
                    aVar.a = strA;
                    this.C = aVar;
                    return (T) sy2VarF.deserialize(this);
                } catch (td9 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strD2 = z2a.D(z2a.O(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = BuildConfig.FLAVOR;
                    int iT = z2a.t(message3, '\n', 0, 6);
                    if (iT != -1) {
                        strSubstring = message3.substring(iT + 1, message3.length());
                    }
                    h2a.m(h2aVar, strD2, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strA2 = q58.a(sl5Var, ((l2) sy2Var).getDescriptor());
            JsonElement jsonElementM = M();
            String strA3 = ((l2) sy2Var).getDescriptor().a();
            if (!(jsonElementM instanceof JsonObject)) {
                throw new gm5(ha7.d("Expected " + ll8.a(JsonObject.class).c() + ", but had " + ll8.a(jsonElementM.getClass()).c() + " as the serialized body of " + strA3, cn5Var.a(), null, sl5Var.a.i ? ha7.h(jsonElementM.toString(), -1).toString() : null, -1));
            }
            JsonObject jsonObject = (JsonObject) jsonElementM;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strA2);
            if (jsonElement != null) {
                JsonPrimitive jsonPrimitiveC = hm5.c(jsonElement);
                strD = jsonPrimitiveC instanceof JsonNull ? null : jsonPrimitiveC.d();
            }
            try {
                return (T) aa7.a(sl5Var, strA2, jsonObject, sm3.f((l2) sy2Var, this, strD));
            } catch (td9 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw new gm5(ha7.d(message4, null, null, sl5Var.a.i ? ha7.h(jsonObject.toString(), -1).toString() : null, -1));
            }
            message = e.getMessage();
            message.getClass();
            if (z2a.o(message, "at path", false)) {
                throw e;
            }
            throw new mv6(e.getMessage() + " at path: " + cn5Var.a(), e, e.t, e.u);
        } catch (mv6 e3) {
            message = e3.getMessage();
            message.getClass();
            if (z2a.o(message, "at path", false)) {
                throw e3;
            }
            throw new mv6(e3.getMessage() + " at path: " + cn5Var.a(), e3, e3.t, e3.u);
        }
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final char D() {
        h2a h2aVar = this.z;
        String strJ = h2aVar.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        h2a.m(h2aVar, eca.a('\'', "Expected single char, but got '", strJ), 0, null, 6);
        throw null;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final int F(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return ym5.b(serialDescriptor, this.x, S(), " at path ".concat(this.z.c.a()));
    }

    @Override // defpackage.ln4, defpackage.rt1
    public final <T> T J(SerialDescriptor serialDescriptor, int i, sy2<? extends T> sy2Var, T t) {
        cn5 cn5Var = this.z.c;
        serialDescriptor.getClass();
        sy2Var.getClass();
        boolean z = this.y == zqb.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = cn5Var.c;
            int i2 = cn5Var.d;
            if (iArr[i2] == -2) {
                cn5Var.b[i2] = cn5.b.a;
            }
        }
        T t2 = (T) C(sy2Var);
        if (z) {
            int[] iArr2 = cn5Var.c;
            int i3 = cn5Var.d;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                cn5Var.d = i4;
                if (i4 == cn5Var.b.length) {
                    cn5Var.b();
                }
            }
            Object[] objArr = cn5Var.b;
            int i5 = cn5Var.d;
            objArr[i5] = cn5Var.a.i ? t2 : cn5.a.a;
            cn5Var.c[i5] = -2;
        }
        return t2;
    }

    @Override // defpackage.em5
    public final JsonElement M() {
        return new mn5(this.x.a, this.z).b();
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final int O() {
        h2a h2aVar = this.z;
        long jH = h2aVar.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        h2a.m(h2aVar, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final String S() {
        boolean z = this.D.b;
        h2a h2aVar = this.z;
        return z ? h2aVar.k() : h2aVar.i();
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final long Z() {
        return this.z.h();
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final boolean d0() {
        boolean z;
        im5 im5Var = this.E;
        if (!(im5Var != null ? im5Var.b : false)) {
            h2a h2aVar = this.z;
            int iS = h2aVar.s(h2aVar.t());
            int length = h2aVar.o().length() - iS;
            if (length >= 4 && iS != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || bw5.a(h2aVar.o().charAt(iS + 4)) != 0) {
                            h2aVar.b = iS + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == h2aVar.o().charAt(iS + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0213 A[EDGE_INSN: B:130:0x0213->B:131:0x0214 BREAK  A[LOOP:0: B:46:0x008e->B:110:0x019e]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rt1
    public final int g0(SerialDescriptor serialDescriptor) {
        byte b;
        h2a h2aVar = this.z;
        cn5 cn5Var = h2aVar.c;
        serialDescriptor.getClass();
        zqb zqbVar = this.y;
        int iOrdinal = zqbVar.ordinal();
        char c = ':';
        int i = 0;
        zU = false;
        boolean zU = false;
        byte b2 = 1;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zU2 = h2aVar.u();
            while (true) {
                boolean zB = h2aVar.b();
                im5 im5Var = this.E;
                if (zB) {
                    boolean z = this.D.b;
                    String strK = z ? h2aVar.k() : h2aVar.d();
                    h2aVar.g(c);
                    sl5 sl5Var = this.x;
                    int iA = ym5.a(serialDescriptor, sl5Var, strK);
                    byte b3 = b2;
                    if (iA != -3) {
                        if (im5Var != null) {
                            be3 be3Var = im5Var.a;
                            if (iA < 64) {
                                be3Var.c |= 1 << iA;
                            } else {
                                int i3 = (iA >>> 6) - 1;
                                long[] jArr = be3Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iA & 63));
                            }
                        }
                        i2 = iA;
                        break;
                    }
                    if (!ym5.c(sl5Var, serialDescriptor)) {
                        a aVar = this.C;
                        if (aVar == null || !xj5.a(aVar.a, strK)) {
                            int i4 = cn5Var.d;
                            int[] iArr = cn5Var.c;
                            if (iArr[i4] == -2) {
                                iArr[i4] = -1;
                                cn5Var.d = i4 - 1;
                            }
                            int i5 = cn5Var.d;
                            if (i5 != -1) {
                                cn5Var.d = i5 - 1;
                            }
                            h2aVar.l(z2a.x(6, h2aVar.o().subSequence(0, h2aVar.b).toString(), strK), eca.a('\'', "Encountered an unknown key '", strK), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw null;
                        }
                        aVar.a = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bQ = h2aVar.q();
                    if (bQ == 8 || bQ == 6) {
                        while (true) {
                            byte bQ2 = h2aVar.q();
                            b = b3;
                            if (bQ2 != b) {
                                if (bQ2 == 8 || bQ2 == 6) {
                                    arrayList.add(Byte.valueOf(bQ2));
                                } else if (bQ2 == 9) {
                                    if (((Number) th1.G(arrayList)).byteValue() != 8) {
                                        h2a.m(h2aVar, "found ] instead of }", 0, null, 6);
                                        throw null;
                                    }
                                    rh1.r(arrayList);
                                } else if (bQ2 == 7) {
                                    if (((Number) th1.G(arrayList)).byteValue() != 6) {
                                        h2a.m(h2aVar, "found } instead of ]", 0, null, 6);
                                        throw null;
                                    }
                                    rh1.r(arrayList);
                                } else if (bQ2 == 10) {
                                    h2a.m(h2aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                h2aVar.e();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            } else if (z) {
                                h2aVar.j();
                            } else {
                                h2aVar.d();
                            }
                            b3 = b;
                        }
                    } else {
                        h2aVar.j();
                        b = b3;
                    }
                    zU2 = h2aVar.u();
                    b2 = b;
                    c = ':';
                } else if (!zU2) {
                    if (im5Var == null) {
                        i2 = -1;
                        break;
                    }
                    be3 be3Var2 = im5Var.a;
                    im5.a aVar2 = be3Var2.b;
                    SerialDescriptor serialDescriptor2 = be3Var2.a;
                    int iF = serialDescriptor2.f();
                    while (true) {
                        long j = be3Var2.c;
                        long j2 = -1;
                        if (j == -1) {
                            if (iF <= 64) {
                                i2 = -1;
                                break;
                            }
                            long[] jArr2 = be3Var2.d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i >= length) {
                                    i2 = -1;
                                    break;
                                }
                                int i6 = i + 1;
                                int i7 = i6 * 64;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        i2 = iNumberOfTrailingZeros + i7;
                                        if (((Boolean) aVar2.invoke(serialDescriptor2, Integer.valueOf(i2))).booleanValue()) {
                                            jArr2[i] = j3;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i6;
                                        j2 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            be3Var2.c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) aVar2.invoke(serialDescriptor2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i2 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    ha7.f(h2aVar);
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zU3 = h2aVar.u();
            if (h2aVar.b()) {
                int i8 = this.B;
                if (i8 != -1 && !zU3) {
                    h2a.m(h2aVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.B = i2;
            } else if (zU3) {
                ha7.e(h2aVar, "array");
                throw null;
            }
        } else {
            int i9 = this.B;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                h2aVar.g(':');
            } else if (i9 != -1) {
                zU = h2aVar.u();
            }
            if (h2aVar.b()) {
                if (objArr != false) {
                    int i10 = this.B;
                    int i11 = h2aVar.b;
                    if (i10 == -1) {
                        if (zU) {
                            h2a.m(h2aVar, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!zU) {
                        h2a.m(h2aVar, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.B + 1;
                this.B = i2;
            } else if (zU) {
                ha7.f(h2aVar);
                throw null;
            }
        }
        if (zqbVar != zqb.MAP) {
            cn5Var.c[cn5Var.d] = i2;
        }
        return i2;
    }

    @Override // defpackage.ln4, defpackage.rt1
    public final void i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.f() == 0 && ym5.c(this.x, serialDescriptor)) {
            while (g0(serialDescriptor) != -1) {
            }
        }
        h2a h2aVar = this.z;
        if (h2aVar.u()) {
            ha7.e(h2aVar, BuildConfig.FLAVOR);
            throw null;
        }
        h2aVar.g(this.y.u);
        cn5 cn5Var = h2aVar.c;
        int i = cn5Var.d;
        int[] iArr = cn5Var.c;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            cn5Var.d = i - 1;
        }
        int i2 = cn5Var.d;
        if (i2 != -1) {
            cn5Var.d = i2 - 1;
        }
    }

    @Override // defpackage.rt1
    public final ln4 k() {
        return this.A;
    }

    @Override // defpackage.em5
    public final sl5 l0() {
        return this.x;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final rt1 n(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        sl5 sl5Var = this.x;
        zqb zqbVarB = arb.b(sl5Var, serialDescriptor);
        h2a h2aVar = this.z;
        cn5 cn5Var = h2aVar.c;
        cn5Var.getClass();
        int i = cn5Var.d + 1;
        cn5Var.d = i;
        if (i == cn5Var.b.length) {
            cn5Var.b();
        }
        cn5Var.b[i] = serialDescriptor;
        h2aVar.g(zqbVarB.t);
        if (h2aVar.q() == 4) {
            h2a.m(h2aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = zqbVarB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new x1a(sl5Var, zqbVarB, h2aVar, serialDescriptor, this.C);
        }
        return (this.y == zqbVarB && sl5Var.a.d) ? this : new x1a(sl5Var, zqbVarB, h2aVar, serialDescriptor, this.C);
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final Decoder n0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return z1a.a(serialDescriptor) ? new fm5(this.z, this.x) : this;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final byte q0() {
        h2a h2aVar = this.z;
        long jH = h2aVar.h();
        byte b = (byte) jH;
        if (jH == b) {
            return b;
        }
        h2a.m(h2aVar, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final short t0() {
        h2a h2aVar = this.z;
        long jH = h2aVar.h();
        short s = (short) jH;
        if (jH == s) {
            return s;
        }
        h2a.m(h2aVar, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final float u0() {
        h2a h2aVar = this.z;
        String strJ = h2aVar.j();
        try {
            float f = Float.parseFloat(strJ);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            h2a.m(h2aVar, ha7.i(null, Float.valueOf(f)), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            h2a.m(h2aVar, eca.a('\'', "Failed to parse type 'float' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final double y0() {
        h2a h2aVar = this.z;
        String strJ = h2aVar.j();
        try {
            double d = Double.parseDouble(strJ);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            h2a.m(h2aVar, ha7.i(null, Double.valueOf(d)), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            h2a.m(h2aVar, eca.a('\'', "Failed to parse type 'double' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        boolean z;
        boolean z2;
        h2a h2aVar = this.z;
        int iT = h2aVar.t();
        String str = h2aVar.f;
        if (iT == str.length()) {
            h2a.m(h2aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z = true;
        } else {
            z = false;
        }
        int iS = h2aVar.s(iT);
        if (iS >= str.length() || iS == -1) {
            h2a.m(h2aVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iS + 1;
        int iCharAt = str.charAt(iS) | ' ';
        if (iCharAt == 102) {
            h2aVar.c(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                h2a.m(h2aVar, "Expected valid boolean literal prefix, but had '" + h2aVar.j() + '\'', 0, null, 6);
                throw null;
            }
            h2aVar.c(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (h2aVar.b == str.length()) {
            h2a.m(h2aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(h2aVar.b) == '\"') {
            h2aVar.b++;
            return z2;
        }
        h2a.m(h2aVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }
}
