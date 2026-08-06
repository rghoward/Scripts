package io.intercom.android.sdk.m5.conversation.states;

import defpackage.ru3;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FooterNoticeState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> avatars;
    private final String subtitle;
    private final String title;

    public FooterNoticeState(String str, String str2, List<AvatarWrapper> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.avatars = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterNoticeState copy$default(FooterNoticeState footerNoticeState, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footerNoticeState.title;
        }
        if ((i & 2) != 0) {
            str2 = footerNoticeState.subtitle;
        }
        if ((i & 4) != 0) {
            list = footerNoticeState.avatars;
        }
        return footerNoticeState.copy(str, str2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<AvatarWrapper> component3() {
        return this.avatars;
    }

    public final FooterNoticeState copy(String str, String str2, List<AvatarWrapper> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new FooterNoticeState(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNoticeState)) {
            return false;
        }
        FooterNoticeState footerNoticeState = (FooterNoticeState) obj;
        return xj5.a(this.title, footerNoticeState.title) && xj5.a(this.subtitle, footerNoticeState.subtitle) && xj5.a(this.avatars, footerNoticeState.avatars);
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.avatars.hashCode() + ru3.c(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FooterNoticeState(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", avatars=");
        return zc6.a(sb, this.avatars, ')');
    }
}
