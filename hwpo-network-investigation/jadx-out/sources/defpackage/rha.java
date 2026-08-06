package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rha extends v65 {
    public final String b;
    public final k95<String> c;

    public rha(String str, String str2, ul8 ul8Var) {
        super(str);
        xl7.g(!ul8Var.isEmpty());
        this.b = str2;
        k95<String> k95VarQ = k95.q(ul8Var);
        this.c = k95VarQ;
        k95VarQ.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // su6.a
    public final void b(np6.a aVar) {
        byte b;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        k95<String> k95Var = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    aVar.c = k95Var.get(0);
                    break;
                case 1:
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    aVar.s = k95Var.get(0);
                    break;
                case 2:
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    String str = k95Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    aVar.m = Integer.valueOf(i);
                    aVar.n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    aVar.b = k95Var.get(0);
                    break;
                case 4:
                case 19:
                    aVar.d = k95Var.get(0);
                    break;
                case 5:
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    aVar.t = k95Var.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = k95Var.get(0);
                    String str3 = n6b.a;
                    String[] strArrSplit = str2.split(AgentHeaderCreator.AGENT_DIVIDER, -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    aVar.h = Integer.valueOf(i3);
                    aVar.i = numValueOf;
                    break;
                case 7:
                case 17:
                    aVar.a = k95Var.get(0);
                    break;
                case 8:
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    aVar.r = k95Var.get(0);
                    break;
                case 9:
                case 22:
                    aVar.l = Integer.valueOf(Integer.parseInt(k95Var.get(0)));
                    break;
                case 12:
                    Integer numN1 = ek5.n1(k95Var.get(0));
                    if (numN1 != null) {
                        String strA = y65.a(numN1.intValue());
                        if (strA != null) {
                            aVar.w = strA;
                        }
                    } else {
                        aVar.w = k95Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d(k95Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.n = (Integer) arrayListD.get(2);
                            }
                        }
                        aVar.m = (Integer) arrayListD.get(1);
                    }
                    aVar.l = (Integer) arrayListD.get(0);
                    break;
                case h4c.e /* 15 */:
                    ArrayList arrayListD2 = d(k95Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.q = (Integer) arrayListD2.get(2);
                            }
                        }
                        aVar.p = (Integer) arrayListD2.get(1);
                    }
                    aVar.o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rha.class != obj.getClass()) {
            return false;
        }
        rha rhaVar = (rha) obj;
        return this.a.equals(rhaVar.a) && Objects.equals(this.b, rhaVar.b) && this.c.equals(rhaVar.c);
    }

    public final int hashCode() {
        int iC = ru3.c(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
