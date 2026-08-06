package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cf8 implements he7 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ou3 g = new ou3("key", wb0.a(vb0.b(we8.class, new x50(1))));
    public static final ou3 h = new ou3("value", wb0.a(vb0.b(we8.class, new x50(2))));
    public static final bf8 i = new bf8();
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ge7<Object> d;
    public final ff8 e = new ff8(this);

    public cf8(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ge7 ge7Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = ge7Var;
    }

    public static int k(ou3 ou3Var) {
        we8 we8Var = (we8) ((Annotation) ou3Var.b.get(we8.class));
        if (we8Var != null) {
            return we8Var.tag();
        }
        throw new cg3("Field has no @Protobuf config");
    }

    @Override // defpackage.he7
    public final he7 a(ou3 ou3Var, Object obj) throws IOException {
        i(ou3Var, obj, true);
        return this;
    }

    public final void b(ou3 ou3Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((k(ou3Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ou3 ou3Var, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return;
        }
        we8 we8Var = (we8) ((Annotation) ou3Var.b.get(we8.class));
        if (we8Var == null) {
            throw new cg3("Field has no @Protobuf config");
        }
        int iOrdinal = we8Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(we8Var.tag() << 3);
            l(i2);
        } else if (iOrdinal == 1) {
            l(we8Var.tag() << 3);
            l((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((we8Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    @Override // defpackage.he7
    public final he7 d(ou3 ou3Var, boolean z) throws IOException {
        c(ou3Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.he7
    public final he7 e(ou3 ou3Var, int i2) throws IOException {
        c(ou3Var, i2, true);
        return this;
    }

    @Override // defpackage.he7
    public final he7 f(ou3 ou3Var, double d) throws IOException {
        b(ou3Var, d, true);
        return this;
    }

    @Override // defpackage.he7
    public final he7 g(ou3 ou3Var, long j) throws IOException {
        h(ou3Var, j, true);
        return this;
    }

    public final void h(ou3 ou3Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        we8 we8Var = (we8) ((Annotation) ou3Var.b.get(we8.class));
        if (we8Var == null) {
            throw new cg3("Field has no @Protobuf config");
        }
        int iOrdinal = we8Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(we8Var.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(we8Var.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((we8Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(ou3 ou3Var, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(ou3Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(ou3Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, ou3Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(ou3Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            l((k(ou3Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(ou3Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(ou3Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(ou3Var) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        ge7 ge7Var = (ge7) this.b.get(obj.getClass());
        if (ge7Var != null) {
            j(ge7Var, ou3Var, obj, z);
            return;
        }
        jab jabVar = (jab) this.c.get(obj.getClass());
        if (jabVar != null) {
            ff8 ff8Var = this.e;
            ff8Var.a = false;
            ff8Var.c = ou3Var;
            ff8Var.b = z;
            jabVar.a(obj, ff8Var);
            return;
        }
        if (obj instanceof te8) {
            c(ou3Var, ((te8) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(ou3Var, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, ou3Var, obj, z);
        }
    }

    public final void j(ge7 ge7Var, ou3 ou3Var, Object obj, boolean z) throws IOException {
        k66 k66Var = new k66();
        k66Var.t = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = k66Var;
            try {
                ge7Var.a(obj, this);
                this.a = outputStream;
                long j = k66Var.t;
                k66Var.close();
                if (z && j == 0) {
                    return;
                }
                l((k(ou3Var) << 3) | 2);
                m(j);
                ge7Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                k66Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
