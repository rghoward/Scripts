package io.intercom.android.sdk.ui.theme;

import defpackage.r43;
import defpackage.wja;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTypography {
    public static final int $stable = 0;
    private final wja type01;
    private final wja type02;
    private final wja type03;
    private final wja type04;
    private final wja type04Point5;
    private final wja type04SemiBold;
    private final wja type05;

    public IntercomTypography(wja wjaVar, wja wjaVar2, wja wjaVar3, wja wjaVar4, wja wjaVar5, wja wjaVar6, wja wjaVar7) {
        wjaVar.getClass();
        wjaVar2.getClass();
        wjaVar3.getClass();
        wjaVar4.getClass();
        wjaVar5.getClass();
        wjaVar6.getClass();
        wjaVar7.getClass();
        this.type01 = wjaVar;
        this.type02 = wjaVar2;
        this.type03 = wjaVar3;
        this.type04 = wjaVar4;
        this.type04SemiBold = wjaVar5;
        this.type04Point5 = wjaVar6;
        this.type05 = wjaVar7;
    }

    public static /* synthetic */ IntercomTypography copy$default(IntercomTypography intercomTypography, wja wjaVar, wja wjaVar2, wja wjaVar3, wja wjaVar4, wja wjaVar5, wja wjaVar6, wja wjaVar7, int i, Object obj) {
        if ((i & 1) != 0) {
            wjaVar = intercomTypography.type01;
        }
        if ((i & 2) != 0) {
            wjaVar2 = intercomTypography.type02;
        }
        if ((i & 4) != 0) {
            wjaVar3 = intercomTypography.type03;
        }
        if ((i & 8) != 0) {
            wjaVar4 = intercomTypography.type04;
        }
        if ((i & 16) != 0) {
            wjaVar5 = intercomTypography.type04SemiBold;
        }
        if ((i & 32) != 0) {
            wjaVar6 = intercomTypography.type04Point5;
        }
        if ((i & 64) != 0) {
            wjaVar7 = intercomTypography.type05;
        }
        wja wjaVar8 = wjaVar6;
        wja wjaVar9 = wjaVar7;
        wja wjaVar10 = wjaVar5;
        wja wjaVar11 = wjaVar3;
        return intercomTypography.copy(wjaVar, wjaVar2, wjaVar11, wjaVar4, wjaVar10, wjaVar8, wjaVar9);
    }

    public final wja component1() {
        return this.type01;
    }

    public final wja component2() {
        return this.type02;
    }

    public final wja component3() {
        return this.type03;
    }

    public final wja component4() {
        return this.type04;
    }

    public final wja component5() {
        return this.type04SemiBold;
    }

    public final wja component6() {
        return this.type04Point5;
    }

    public final wja component7() {
        return this.type05;
    }

    public final IntercomTypography copy(wja wjaVar, wja wjaVar2, wja wjaVar3, wja wjaVar4, wja wjaVar5, wja wjaVar6, wja wjaVar7) {
        wjaVar.getClass();
        wjaVar2.getClass();
        wjaVar3.getClass();
        wjaVar4.getClass();
        wjaVar5.getClass();
        wjaVar6.getClass();
        wjaVar7.getClass();
        return new IntercomTypography(wjaVar, wjaVar2, wjaVar3, wjaVar4, wjaVar5, wjaVar6, wjaVar7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTypography)) {
            return false;
        }
        IntercomTypography intercomTypography = (IntercomTypography) obj;
        return xj5.a(this.type01, intercomTypography.type01) && xj5.a(this.type02, intercomTypography.type02) && xj5.a(this.type03, intercomTypography.type03) && xj5.a(this.type04, intercomTypography.type04) && xj5.a(this.type04SemiBold, intercomTypography.type04SemiBold) && xj5.a(this.type04Point5, intercomTypography.type04Point5) && xj5.a(this.type05, intercomTypography.type05);
    }

    public final wja getType01() {
        return this.type01;
    }

    public final wja getType02() {
        return this.type02;
    }

    public final wja getType03() {
        return this.type03;
    }

    public final wja getType04() {
        return this.type04;
    }

    public final wja getType04Point5() {
        return this.type04Point5;
    }

    public final wja getType04SemiBold() {
        return this.type04SemiBold;
    }

    public final wja getType05() {
        return this.type05;
    }

    public int hashCode() {
        return this.type05.hashCode() + r43.a(this.type04Point5, r43.a(this.type04SemiBold, r43.a(this.type04, r43.a(this.type03, r43.a(this.type02, this.type01.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "IntercomTypography(type01=" + this.type01 + ", type02=" + this.type02 + ", type03=" + this.type03 + ", type04=" + this.type04 + ", type04SemiBold=" + this.type04SemiBold + ", type04Point5=" + this.type04Point5 + ", type05=" + this.type05 + ')';
    }
}
