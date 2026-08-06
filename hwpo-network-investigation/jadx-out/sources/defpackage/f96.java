package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f96 implements qg0 {
    public final k95<qg0> a;
    public final int b;

    public f96(int i, ul8 ul8Var) {
        this.b = i;
        this.a = ul8Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f96 b(int i, pt7 pt7Var) {
        String str;
        qg0 p1aVar;
        String str2;
        k95.a aVar = new k95.a();
        int i2 = pt7Var.c;
        int iA = -2;
        while (pt7Var.a() > 8) {
            int iO = pt7Var.o();
            int iO2 = pt7Var.b + pt7Var.o();
            pt7Var.L(iO2);
            if (iO != 1414744396) {
                tg0 tg0Var = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iS = pt7Var.s();
                                if (iS == 1) {
                                    str = "audio/raw";
                                } else if (iS == 85) {
                                    str = "audio/mpeg";
                                } else if (iS == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iS != 8192) {
                                    str = iS != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iS2 = pt7Var.s();
                                    int iO3 = pt7Var.o();
                                    pt7Var.N(6);
                                    int iS3 = pt7Var.s();
                                    String str3 = n6b.a;
                                    int iZ = n6b.z(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS4 = pt7Var.a() > 0 ? pt7Var.s() : 0;
                                    id4.a aVar2 = new id4.a();
                                    aVar2.n = fv6.n(str);
                                    aVar2.F = iS2;
                                    aVar2.G = iO3;
                                    if (str.equals("audio/raw") && iZ != 0) {
                                        aVar2.H = iZ;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iS4 > 0) {
                                        byte[] bArr = new byte[iS4];
                                        pt7Var.k(bArr, 0, iS4);
                                        aVar2.q = k95.v(bArr);
                                    }
                                    p1aVar = new p1a(new id4(aVar2));
                                } else {
                                    d80.a(iS, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                md6.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(n6b.D(iA)));
                            }
                            p1aVar = tg0Var;
                            break;
                        } else {
                            pt7Var.N(4);
                            int iO4 = pt7Var.o();
                            int iO5 = pt7Var.o();
                            pt7Var.N(4);
                            int iO6 = pt7Var.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                id4.a aVar3 = new id4.a();
                                aVar3.u = iO4;
                                aVar3.v = iO5;
                                aVar3.n = fv6.n(str2);
                                p1aVar = new p1a(new id4(aVar3));
                            } else {
                                d80.a(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                p1aVar = tg0Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = pt7Var.o();
                        pt7Var.N(8);
                        int iO8 = pt7Var.o();
                        int iO9 = pt7Var.o();
                        pt7Var.N(4);
                        pt7Var.o();
                        pt7Var.N(12);
                        p1aVar = new sg0(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = pt7Var.o();
                        pt7Var.N(12);
                        pt7Var.o();
                        int iO11 = pt7Var.o();
                        int iO12 = pt7Var.o();
                        pt7Var.N(4);
                        int iO13 = pt7Var.o();
                        int iO14 = pt7Var.o();
                        pt7Var.N(4);
                        tg0Var = new tg0(iO10, iO11, iO12, iO13, iO14, pt7Var.o());
                        p1aVar = tg0Var;
                        break;
                    case 1852994675:
                        p1aVar = new t1a(pt7Var.x(pt7Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        p1aVar = tg0Var;
                        break;
                }
            } else {
                p1aVar = b(pt7Var.o(), pt7Var);
            }
            if (p1aVar != null) {
                if (p1aVar.d() == 1752331379) {
                    iA = ((tg0) p1aVar).a();
                }
                aVar.c(p1aVar);
            }
            pt7Var.M(iO2);
            pt7Var.L(i2);
        }
        return new f96(i, aVar.g());
    }

    public final <T extends qg0> T a(Class<T> cls) {
        k95.b bVarListIterator = this.a.listIterator(0);
        while (bVarListIterator.hasNext()) {
            T t = (T) bVarListIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // defpackage.qg0
    public final int d() {
        return this.b;
    }
}
