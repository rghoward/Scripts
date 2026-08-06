package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zs4 implements jac {
    public static po t;
    public static ol u;
    public static s41 v;
    public static final /* synthetic */ zs4 w = new zs4();

    public static final a04 b(vy6 vy6Var, wy6 wy6Var) {
        int iOrdinal = wy6Var.ordinal();
        if (iOrdinal == 0) {
            return vy6Var.f();
        }
        if (iOrdinal == 1) {
            return vy6Var.c();
        }
        if (iOrdinal == 2) {
            return vy6Var.e();
        }
        if (iOrdinal == 3) {
            return vy6Var.d();
        }
        if (iOrdinal == 4) {
            return vy6Var.b();
        }
        if (iOrdinal == 5) {
            return vy6Var.a();
        }
        u.b();
        return null;
    }

    public static final int c(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int iHashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int iF = serialDescriptor.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i2 = iF - 1;
            int i3 = i * 31;
            String strA = serialDescriptor.i(serialDescriptor.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iF = i2;
        }
        int iF2 = serialDescriptor.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iF2 - 1;
            int i5 = iHashCode3 * 31;
            pd9 pd9VarE = serialDescriptor.i(serialDescriptor.f() - iF2).e();
            iHashCode3 = i5 + (pd9VarE != null ? pd9VarE.hashCode() : 0);
            iF2 = i4;
        }
    }

    public static final String d(SerialDescriptor serialDescriptor) {
        return th1.F(uh8.j(0, serialDescriptor.f()), ", ", serialDescriptor.a() + '(', ")", new yx5(1, serialDescriptor), 24);
    }

    public static final a04 e(wy6 wy6Var, jt1 jt1Var) {
        return b((vy6) jt1Var.F(tk6.a), wy6Var);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().G());
    }
}
