package defpackage;

import io.ably.lib.util.Crypto;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fv2 {
    public final int a;
    public final List<id4> b;

    public fv2(int i, List<id4> list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    public final pya a(int i, pya.b bVar) {
        String str = bVar.a;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new qx7(new zz6(str, bVar.a(), "video/mp2t"));
            }
            if (i == 21) {
                return new qx7(new x65());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new qx7(new us4(new l99(b(bVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new qx7(new vs4(new l99(b(bVar))));
            }
            if (i == 45) {
                return new qx7(new b07());
            }
            if (i == 89) {
                return new qx7(new s93(bVar.c));
            }
            if (i == 172) {
                return new qx7(new i3(str, bVar.a(), "video/mp2t"));
            }
            if (i == 257) {
                return new q89(new zt7("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new qx7(new h93(str, bVar.a(), 5408));
                }
                switch (i) {
                    case h4c.e /* 15 */:
                        if (c(2)) {
                            return null;
                        }
                        return new qx7(new ae(str, "video/mp2t", bVar.a(), false));
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        return new qx7(new ts4(new n5b(b(bVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new qx7(new bq5(str, bVar.a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new qx7(new e3(str, bVar.a(), "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new q89(new zt7("application/x-scte35"));
                                    case 135:
                                        return new qx7(new e3(str, bVar.a(), "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new qx7(new h93(str, bVar.a(), 4096));
        }
        return new qx7(new ss4(new n5b(b(bVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final List<id4> b(pya.b bVar) {
        String str;
        int i;
        List<byte[]> listSingletonList;
        boolean zC = c(32);
        List<id4> list = this.b;
        if (zC) {
            return list;
        }
        pt7 pt7Var = new pt7(bVar.d);
        ArrayList arrayList = list;
        while (pt7Var.a() > 0) {
            int iZ = pt7Var.z();
            int iZ2 = pt7Var.b + pt7Var.z();
            if (iZ == 134) {
                arrayList = new ArrayList();
                int iZ3 = pt7Var.z() & 31;
                for (int i2 = 0; i2 < iZ3; i2++) {
                    String strX = pt7Var.x(3, StandardCharsets.UTF_8);
                    int iZ4 = pt7Var.z();
                    boolean z = (iZ4 & 128) != 0;
                    if (z) {
                        i = iZ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZ = (byte) pt7Var.z();
                    pt7Var.N(1);
                    if (z) {
                        boolean z2 = (bZ & 64) != 0;
                        byte[] bArr = og1.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    id4.a aVar = new id4.a();
                    aVar.n = fv6.n(str);
                    aVar.d = strX;
                    aVar.K = i;
                    aVar.q = listSingletonList;
                    arrayList.add(new id4(aVar));
                }
            }
            pt7Var.M(iZ2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean c(int i) {
        return (this.a & i) != 0;
    }
}
