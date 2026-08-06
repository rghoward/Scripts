package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bl7 implements jac {
    public static final /* synthetic */ bl7 t = new bl7();

    public static ArrayList b(byte[] bArr) {
        long j = (((long) (((bArr[11] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[10] & MessagePack.Code.EXT_TIMESTAMP))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final h37 c(zz9 zz9Var, jt1 jt1Var, int i) {
        return d(zz9Var, zz9Var.getValue(), ff3.t, jt1Var, (i & 14) | ((i << 3) & 896), 0);
    }

    public static final h37 d(zz9 zz9Var, Object obj, h72 h72Var, jt1 jt1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            h72Var = ff3.t;
        }
        boolean zJ = jt1Var.j(h72Var) | jt1Var.j(zz9Var);
        Object objF = jt1Var.f();
        Object obj2 = jt1.a.a;
        if (zJ || objF == obj2) {
            objF = new bv9(h72Var, zz9Var, null);
            jt1Var.C(objF);
        }
        ci4 ci4Var = (ci4) objF;
        Object objF2 = jt1Var.f();
        if (objF2 == obj2) {
            objF2 = i(obj);
            jt1Var.C(objF2);
        }
        h37 h37Var = (h37) objF2;
        boolean zJ2 = jt1Var.j(ci4Var);
        Object objF3 = jt1Var.f();
        if (zJ2 || objF3 == obj2) {
            objF3 = new av9(ci4Var, h37Var, null);
            jt1Var.C(objF3);
        }
        wd3.f(zz9Var, h72Var, (ci4) objF3, jt1Var);
        return h37Var;
    }

    public static final k37 e() {
        kv9<k37<oy2>> kv9Var = xu9.b;
        k37<oy2> k37VarA = kv9Var.a();
        if (k37VarA != null) {
            return k37VarA;
        }
        k37<oy2> k37Var = new k37<>(new oy2[0]);
        kv9Var.b(k37Var);
        return k37Var;
    }

    public static final my2 f(mh4 mh4Var) {
        kv9<hg5> kv9Var = xu9.a;
        return new my2(mh4Var, null);
    }

    public static final my2 g(mh4 mh4Var, wu9 wu9Var) {
        kv9<hg5> kv9Var = xu9.a;
        return new my2(mh4Var, wu9Var);
    }

    public static long h(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & MessagePack.Code.EXT_TIMESTAMP;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static dt7 i(Object obj) {
        return new dt7(obj, d3a.u);
    }

    public static final h37 j(Object obj, jt1 jt1Var) {
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = i(obj);
            jt1Var.C(objF);
        }
        h37 h37Var = (h37) objF;
        h37Var.setValue(obj);
        return h37Var;
    }

    public static final oz8 k(mh4 mh4Var) {
        return new oz8(new cv9(mh4Var, null));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().n0());
    }
}
