package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d71 {
    public final int a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final List<String> k;
    public final zc8 l;
    public final tc8 m;
    public final List<l89> n;
    public final List<l89> o;

    public d71(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, List<String> list, zc8 zc8Var, tc8 tc8Var, List<l89> list2, List<l89> list3) {
        str.getClass();
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = str2;
        this.k = list;
        this.l = zc8Var;
        this.m = tc8Var;
        this.n = list2;
        this.o = list3;
    }

    public static d71 a(d71 d71Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, List list, zc8 zc8Var, tc8 tc8Var, ArrayList arrayList, ArrayList arrayList2, int i) {
        int i2 = d71Var.a;
        int i3 = d71Var.b;
        String str2 = d71Var.c;
        boolean z7 = (i & 8) != 0 ? d71Var.d : z;
        boolean z8 = (i & 16) != 0 ? d71Var.e : z2;
        boolean z9 = (i & 32) != 0 ? d71Var.f : z3;
        boolean z10 = (i & 64) != 0 ? d71Var.g : z4;
        boolean z11 = (i & 128) != 0 ? d71Var.h : z5;
        boolean z12 = (i & 256) != 0 ? d71Var.i : z6;
        String str3 = (i & 512) != 0 ? d71Var.j : str;
        List list2 = (i & 1024) != 0 ? d71Var.k : list;
        zc8 zc8Var2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? d71Var.l : zc8Var;
        tc8 tc8Var2 = (i & 4096) != 0 ? d71Var.m : tc8Var;
        List<l89> list3 = (i & 8192) != 0 ? d71Var.n : arrayList;
        List<l89> list4 = (i & 16384) != 0 ? d71Var.o : arrayList2;
        d71Var.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        return new d71(i2, i3, str2, z7, z8, z9, z10, z11, z12, str3, list2, zc8Var2, tc8Var2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71)) {
            return false;
        }
        d71 d71Var = (d71) obj;
        return this.a == d71Var.a && this.b == d71Var.b && xj5.a(this.c, d71Var.c) && this.d == d71Var.d && this.e == d71Var.e && this.f == d71Var.f && this.g == d71Var.g && this.h == d71Var.h && this.i == d71Var.i && this.j.equals(d71Var.j) && xj5.a(this.k, d71Var.k) && this.l.equals(d71Var.l) && this.m.equals(d71Var.m) && this.n.equals(d71Var.n) && this.o.equals(d71Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ho2.a((this.m.hashCode() + ((this.l.hashCode() + ho2.a(ru3.c(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(ru3.c(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), 31, this.j), 31, this.k)) * 31)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("ChallengeEntryDetailsUiModel(sectionId=", ", scheduleId=", ", title=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", isScoringDetailsTitleVisible=");
        sbB.append(this.d);
        sbB.append(", isScoreDescriptionTextVisible=");
        e4.a(sbB, this.e, ", isPerformanceTextVisible=", this.f, ", isMediaAttachmentsListVisible=");
        e4.a(sbB, this.g, ", isFileAttachmentsListVisible=", this.h, ", isScoreHasValue=");
        sbB.append(this.i);
        sbB.append(", performanceText=");
        sbB.append(this.j);
        sbB.append(", description=");
        sbB.append(this.k);
        sbB.append(", score=");
        sbB.append(this.l);
        sbB.append(", performance=");
        sbB.append(this.m);
        sbB.append(", mediaAttachments=");
        sbB.append(this.n);
        sbB.append(", fileAttachments=");
        sbB.append(this.o);
        sbB.append(")");
        return sbB.toString();
    }
}
