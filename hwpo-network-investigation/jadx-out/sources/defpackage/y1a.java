package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1a implements Encoder, st1 {
    public final kt1 a;
    public final sl5 b;
    public final zqb c;
    public final y1a[] d;
    public final ln4 e;
    public final xl5 f;
    public boolean g;
    public String h;
    public String i;

    public y1a(kt1 kt1Var, sl5 sl5Var, zqb zqbVar, y1a[] y1aVarArr) {
        kt1Var.getClass();
        this.a = kt1Var;
        this.b = sl5Var;
        this.c = zqbVar;
        this.d = y1aVarArr;
        this.e = sl5Var.b;
        this.f = sl5Var.a;
        int iOrdinal = zqbVar.ordinal();
        if (y1aVarArr != null) {
            y1a y1aVar = y1aVarArr[iOrdinal];
            if (y1aVar == null && y1aVar == this) {
                return;
            }
            y1aVarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.st1
    public final Encoder A(h98 h98Var, int i) {
        h98Var.getClass();
        E(h98Var, i);
        return v(h98Var.i(i));
    }

    @Override // defpackage.st1
    public final void B(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        E(serialDescriptor, i);
        y(j);
    }

    @Override // defpackage.st1
    public final boolean C(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return false;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void D(String str) {
        str.getClass();
        this.a.g(str);
    }

    public final void E(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int iOrdinal = this.c.ordinal();
        kt1 kt1Var = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!kt1Var.b) {
                kt1Var.c(',');
            }
            kt1Var.a();
            return;
        }
        if (iOrdinal == 2) {
            if (kt1Var.b) {
                this.g = true;
                kt1Var.a();
                return;
            }
            if (i % 2 == 0) {
                kt1Var.c(',');
                kt1Var.a();
            } else {
                kt1Var.c(':');
                kt1Var.h();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!kt1Var.b) {
                kt1Var.c(',');
            }
            kt1Var.a();
            ym5.d(this.b, serialDescriptor);
            D(serialDescriptor.g(i));
            kt1Var.c(':');
            kt1Var.h();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            kt1Var.c(',');
            kt1Var.h();
            this.g = false;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void a() {
        kt1 kt1Var = this.a;
        kt1Var.getClass();
        kt1Var.a.c("null");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void b(double d) {
        if (this.g) {
            D(String.valueOf(d));
        } else {
            this.a.a.c(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new pm5(ha7.i(null, Double.valueOf(d)), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void c(short s) {
        if (this.g) {
            D(String.valueOf((int) s));
        } else {
            this.a.f(s);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void d(byte b) {
        if (this.g) {
            D(String.valueOf((int) b));
        } else {
            this.a.b(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(boolean z) {
        if (this.g) {
            D(String.valueOf(z));
        } else {
            this.a.a.c(String.valueOf(z));
        }
    }

    @Override // defpackage.st1
    public final void f(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        E(serialDescriptor, i);
        h(f);
    }

    @Override // defpackage.st1
    public final void g(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        E(serialDescriptor, i);
        u(i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(float f) {
        if (this.g) {
            D(String.valueOf(f));
        } else {
            this.a.a.c(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new pm5(ha7.i(null, Float.valueOf(f)), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // defpackage.st1
    public final void i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        kt1 kt1Var = this.a;
        kt1Var.getClass();
        kt1Var.b = false;
        kt1Var.c(this.c.u);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Encoder
    public final <T> void j(ud9<? super T> ud9Var, T t) {
        String strA;
        ud9<? super T> ud9VarG;
        ud9Var.getClass();
        sl5 sl5Var = this.b;
        boolean z = ud9Var instanceof l2;
        rd1 rd1Var = sl5Var.a.h;
        if (!z) {
            int iOrdinal = rd1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    pd9 pd9VarE = ud9Var.getDescriptor().e();
                    strA = (xj5.a(pd9VarE, g3a.a.a) || xj5.a(pd9VarE, g3a.d.a)) ? q58.a(sl5Var, ud9Var.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    u.b();
                    return;
                }
            }
        } else if (rd1Var != rd1.t) {
        }
        if (z) {
            l2 l2Var = (l2) ud9Var;
            if (t == 0) {
                ca0.c(l2Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            ud9VarG = sm3.g(l2Var, this, t);
        } else {
            ud9VarG = ud9Var;
        }
        if (strA != null) {
            SerialDescriptor descriptor = ud9VarG.getDescriptor();
            descriptor.getClass();
            ym5.d(sl5Var, descriptor);
            if (g28.b(descriptor).contains(strA)) {
                String strA2 = ud9Var.getDescriptor().a();
                String strA3 = ud9VarG.getDescriptor().a();
                throw new pm5(av.a(vb0.a("Class '", strA3, "' cannot be serialized ", (sl5Var.a.h == rd1.u && xj5.a(strA2, strA3)) ? "in ALL_JSON_OBJECTS class discriminator mode" : eca.a('\'', "as base class '", strA2), " because it has property name that conflicts with JSON class discriminator '"), strA, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            pd9 pd9VarE2 = ud9VarG.getDescriptor().e();
            pd9VarE2.getClass();
            if (pd9VarE2 instanceof pd9.b) {
                aa0.c("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (pd9VarE2 instanceof j98) {
                aa0.c("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (pd9VarE2 instanceof p58) {
                aa0.c("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strA4 = ud9VarG.getDescriptor().a();
                this.h = strA;
                this.i = strA4;
            }
        }
        ud9VarG.serialize(this, t);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final ln4 k() {
        return this.e;
    }

    @Override // defpackage.st1
    public final void l(h98 h98Var, int i, byte b) {
        h98Var.getClass();
        E(h98Var, i);
        d(b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(char c) {
        D(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final st1 n(SerialDescriptor serialDescriptor) {
        y1a y1aVar;
        serialDescriptor.getClass();
        sl5 sl5Var = this.b;
        zqb zqbVarB = arb.b(sl5Var, serialDescriptor);
        char c = zqbVarB.t;
        kt1 kt1Var = this.a;
        kt1Var.c(c);
        kt1Var.b = true;
        String str = this.h;
        if (str != null) {
            String strA = this.i;
            if (strA == null) {
                strA = serialDescriptor.a();
            }
            kt1Var.a();
            kt1Var.g(str);
            kt1Var.c(':');
            D(strA);
            this.h = null;
            this.i = null;
        }
        if (this.c == zqbVarB) {
            return this;
        }
        y1a[] y1aVarArr = this.d;
        return (y1aVarArr == null || (y1aVar = y1aVarArr[zqbVarB.ordinal()]) == null) ? new y1a(kt1Var, sl5Var, zqbVarB, y1aVarArr) : y1aVar;
    }

    @Override // defpackage.st1
    public final void o(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        E(serialDescriptor, i);
        e(z);
    }

    @Override // defpackage.st1
    public final void p(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        E(serialDescriptor, i);
        D(str);
    }

    @Override // defpackage.st1
    public final void q(SerialDescriptor serialDescriptor, int i, ud9 ud9Var, Object obj) {
        serialDescriptor.getClass();
        ud9Var.getClass();
        E(serialDescriptor, i);
        j(ud9Var, obj);
    }

    @Override // defpackage.st1
    public final void r(h98 h98Var, int i, short s) {
        h98Var.getClass();
        E(h98Var, i);
        c(s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void s(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        D(serialDescriptor.g(i));
    }

    @Override // defpackage.st1
    public final void t(h98 h98Var, int i, char c) {
        h98Var.getClass();
        E(h98Var, i);
        m(c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(int i) {
        if (this.g) {
            D(String.valueOf(i));
        } else {
            this.a.d(i);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean zA = z1a.a(serialDescriptor);
        zqb zqbVar = this.c;
        sl5 sl5Var = this.b;
        kt1 mt1Var = this.a;
        if (zA) {
            if (!(mt1Var instanceof nt1)) {
                mt1Var = new nt1(mt1Var.a, this.g);
            }
            return new y1a(mt1Var, sl5Var, zqbVar, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(hm5.a)) {
            if (!(mt1Var instanceof mt1)) {
                mt1Var = new mt1(mt1Var.a, this.g);
            }
            return new y1a(mt1Var, sl5Var, zqbVar, null);
        }
        if (this.h != null) {
            this.i = serialDescriptor.a();
        }
        return this;
    }

    @Override // defpackage.st1
    public final void x(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        E(serialDescriptor, i);
        b(d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(long j) {
        if (this.g) {
            D(String.valueOf(j));
        } else {
            this.a.e(j);
        }
    }

    @Override // defpackage.st1
    public final <T> void z(SerialDescriptor serialDescriptor, int i, ud9<? super T> ud9Var, T t) {
        serialDescriptor.getClass();
        ud9Var.getClass();
        if (t != null || this.f.d) {
            serialDescriptor.getClass();
            ud9Var.getClass();
            E(serialDescriptor, i);
            if (ud9Var.getDescriptor().c()) {
                j(ud9Var, t);
            } else if (t == null) {
                a();
            } else {
                j(ud9Var, t);
            }
        }
    }
}
