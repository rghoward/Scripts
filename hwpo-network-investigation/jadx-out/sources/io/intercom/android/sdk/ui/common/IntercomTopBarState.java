package io.intercom.android.sdk.ui.common;

import defpackage.qq2;
import defpackage.uh1;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTopBarState {
    public static final int $stable = 0;
    private final uh1 backgroundColor;
    private final uh1 contentColor;
    private final Integer navIcon;
    private final String subTitle;
    private final uh1 subTitleColor;
    private final String title;

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uh1Var, (i & 16) != 0 ? null : uh1Var2, (i & 32) != 0 ? null : uh1Var3, null);
    }

    /* JADX INFO: renamed from: copy-K74yeK8$default, reason: not valid java name */
    public static /* synthetic */ IntercomTopBarState m548copyK74yeK8$default(IntercomTopBarState intercomTopBarState, Integer num, String str, String str2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = intercomTopBarState.navIcon;
        }
        if ((i & 2) != 0) {
            str = intercomTopBarState.title;
        }
        if ((i & 4) != 0) {
            str2 = intercomTopBarState.subTitle;
        }
        if ((i & 8) != 0) {
            uh1Var = intercomTopBarState.backgroundColor;
        }
        if ((i & 16) != 0) {
            uh1Var2 = intercomTopBarState.contentColor;
        }
        if ((i & 32) != 0) {
            uh1Var3 = intercomTopBarState.subTitleColor;
        }
        uh1 uh1Var4 = uh1Var2;
        uh1 uh1Var5 = uh1Var3;
        return intercomTopBarState.m552copyK74yeK8(num, str, str2, uh1Var, uh1Var4, uh1Var5);
    }

    public final Integer component1() {
        return this.navIcon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final uh1 m549component4QN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final uh1 m550component5QN2ZGVo() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: component6-QN2ZGVo, reason: not valid java name */
    public final uh1 m551component6QN2ZGVo() {
        return this.subTitleColor;
    }

    /* JADX INFO: renamed from: copy-K74yeK8, reason: not valid java name */
    public final IntercomTopBarState m552copyK74yeK8(Integer num, String str, String str2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3) {
        return new IntercomTopBarState(num, str, str2, uh1Var, uh1Var2, uh1Var3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarState)) {
            return false;
        }
        IntercomTopBarState intercomTopBarState = (IntercomTopBarState) obj;
        return xj5.a(this.navIcon, intercomTopBarState.navIcon) && xj5.a(this.title, intercomTopBarState.title) && xj5.a(this.subTitle, intercomTopBarState.subTitle) && xj5.a(this.backgroundColor, intercomTopBarState.backgroundColor) && xj5.a(this.contentColor, intercomTopBarState.contentColor) && xj5.a(this.subTitleColor, intercomTopBarState.subTitleColor);
    }

    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m553getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m554getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m555getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.navIcon;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        uh1 uh1Var = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (uh1Var == null ? 0 : Long.hashCode(uh1Var.a))) * 31;
        uh1 uh1Var2 = this.contentColor;
        int iHashCode5 = (iHashCode4 + (uh1Var2 == null ? 0 : Long.hashCode(uh1Var2.a))) * 31;
        uh1 uh1Var3 = this.subTitleColor;
        return iHashCode5 + (uh1Var3 != null ? Long.hashCode(uh1Var3.a) : 0);
    }

    public String toString() {
        return "IntercomTopBarState(navIcon=" + this.navIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", subTitleColor=" + this.subTitleColor + ')';
    }

    private IntercomTopBarState(Integer num, String str, String str2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3) {
        this.navIcon = num;
        this.title = str;
        this.subTitle = str2;
        this.backgroundColor = uh1Var;
        this.contentColor = uh1Var2;
        this.subTitleColor = uh1Var3;
    }

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, qq2 qq2Var) {
        this(num, str, str2, uh1Var, uh1Var2, uh1Var3);
    }
}
