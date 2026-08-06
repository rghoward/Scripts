package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.ho2;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.pi1;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Header {
    public static final int $stable = 8;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("background_color_dark")
    private final String backgroundColorDark;

    @SerializedName("collapsed")
    private final Collapsed collapsed;

    @SerializedName("display_active_indicator")
    private final boolean displayActiveIndicator;

    @SerializedName("expanded")
    private final Expanded expanded;

    @SerializedName("foreground_primary_color")
    private final String foregroundPrimaryColor;

    @SerializedName("foreground_primary_color_dark")
    private final String foregroundPrimaryColorDark;

    @SerializedName("foreground_secondary_color")
    private final String foregroundSecondaryColor;

    @SerializedName("foreground_secondary_color_dark")
    private final String foregroundSecondaryColorDark;

    @SerializedName("hide_greeting")
    private final boolean hideGreeting;

    @SerializedName("use_bot_header")
    private final boolean useBotHeader;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Collapsed {
        public static final int $stable = 8;

        @SerializedName("avatar_details")
        private final AvatarDetails avatarDetails;

        @SerializedName("icon")
        private final HeaderIconType icon;

        @SerializedName("subtitle")
        private final String subtitle;

        @SerializedName("title")
        private final String title;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public enum HeaderIconType {
            CLOCK,
            AI;

            private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

            public static nl3<HeaderIconType> getEntries() {
                return $ENTRIES;
            }
        }

        public Collapsed(AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String str2) {
            str2.getClass();
            this.avatarDetails = avatarDetails;
            this.icon = headerIconType;
            this.subtitle = str;
            this.title = str2;
        }

        public static /* synthetic */ Collapsed copy$default(Collapsed collapsed, AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                avatarDetails = collapsed.avatarDetails;
            }
            if ((i & 2) != 0) {
                headerIconType = collapsed.icon;
            }
            if ((i & 4) != 0) {
                str = collapsed.subtitle;
            }
            if ((i & 8) != 0) {
                str2 = collapsed.title;
            }
            return collapsed.copy(avatarDetails, headerIconType, str, str2);
        }

        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        public final HeaderIconType component2() {
            return this.icon;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final String component4() {
            return this.title;
        }

        public final Collapsed copy(AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String str2) {
            str2.getClass();
            return new Collapsed(avatarDetails, headerIconType, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Collapsed)) {
                return false;
            }
            Collapsed collapsed = (Collapsed) obj;
            return xj5.a(this.avatarDetails, collapsed.avatarDetails) && this.icon == collapsed.icon && xj5.a(this.subtitle, collapsed.subtitle) && xj5.a(this.title, collapsed.title);
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final HeaderIconType getIcon() {
            return this.icon;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            int iHashCode = (avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31;
            HeaderIconType headerIconType = this.icon;
            int iHashCode2 = (iHashCode + (headerIconType == null ? 0 : headerIconType.hashCode())) * 31;
            String str = this.subtitle;
            return this.title.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Collapsed(avatarDetails=");
            sb.append(this.avatarDetails);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", title=");
            return wu0.a(sb, this.title, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Expanded {
        public static final int $stable = 8;

        @SerializedName("avatar_details")
        private final AvatarDetails avatarDetails;

        @SerializedName("body")
        private final List<Body> body;

        @SerializedName("footer")
        private final List<Footer> footer;

        @SerializedName("social_accounts")
        private final List<SocialAccount> socialAccounts;

        @SerializedName("title")
        private final String title;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Body {
            public static final int $stable = 8;

            @SerializedName("color")
            private String color;

            @SerializedName("style")
            private final Style style;

            @SerializedName(AttributeType.TEXT)
            private final String text;

            public Body(Style style, String str, String str2) {
                style.getClass();
                str.getClass();
                this.style = style;
                this.text = str;
                this.color = str2;
            }

            public static /* synthetic */ Body copy$default(Body body, Style style, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    style = body.style;
                }
                if ((i & 2) != 0) {
                    str = body.text;
                }
                if ((i & 4) != 0) {
                    str2 = body.color;
                }
                return body.copy(style, str, str2);
            }

            public final Style component1() {
                return this.style;
            }

            public final String component2() {
                return this.text;
            }

            public final String component3() {
                return this.color;
            }

            public final Body copy(Style style, String str, String str2) {
                style.getClass();
                str.getClass();
                return new Body(style, str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Body)) {
                    return false;
                }
                Body body = (Body) obj;
                return this.style == body.style && xj5.a(this.text, body.text) && xj5.a(this.color, body.color);
            }

            public final String getColor() {
                return this.color;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iC = ru3.c(this.style.hashCode() * 31, 31, this.text);
                String str = this.color;
                return iC + (str == null ? 0 : str.hashCode());
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Body(style=");
                sb.append(this.style);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", color=");
                return wu0.a(sb, this.color, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Footer {
            public static final int $stable = 8;

            @SerializedName("avatar_details")
            private final AvatarDetails avatarDetails;

            @SerializedName("color")
            private String color;

            @SerializedName("style")
            private final Style style;

            @SerializedName(AttributeType.TEXT)
            private final String text;

            public Footer(Style style, String str, String str2, AvatarDetails avatarDetails) {
                style.getClass();
                str.getClass();
                this.style = style;
                this.text = str;
                this.color = str2;
                this.avatarDetails = avatarDetails;
            }

            public static /* synthetic */ Footer copy$default(Footer footer, Style style, String str, String str2, AvatarDetails avatarDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    style = footer.style;
                }
                if ((i & 2) != 0) {
                    str = footer.text;
                }
                if ((i & 4) != 0) {
                    str2 = footer.color;
                }
                if ((i & 8) != 0) {
                    avatarDetails = footer.avatarDetails;
                }
                return footer.copy(style, str, str2, avatarDetails);
            }

            public final Style component1() {
                return this.style;
            }

            public final String component2() {
                return this.text;
            }

            public final String component3() {
                return this.color;
            }

            public final AvatarDetails component4() {
                return this.avatarDetails;
            }

            public final Footer copy(Style style, String str, String str2, AvatarDetails avatarDetails) {
                style.getClass();
                str.getClass();
                return new Footer(style, str, str2, avatarDetails);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) obj;
                return this.style == footer.style && xj5.a(this.text, footer.text) && xj5.a(this.color, footer.color) && xj5.a(this.avatarDetails, footer.avatarDetails);
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final String getColor() {
                return this.color;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iC = ru3.c(this.style.hashCode() * 31, 31, this.text);
                String str = this.color;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                return iHashCode + (avatarDetails != null ? avatarDetails.hashCode() : 0);
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public String toString() {
                return "Footer(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ", avatarDetails=" + this.avatarDetails + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class SocialAccount {
            public static final int $stable = 0;

            @SerializedName("image_url")
            private final String imageUrl;

            @SerializedName("profile_url")
            private final String profileUrl;

            @SerializedName("provider")
            private final String provider;

            @SerializedName("username")
            private final String username;

            public SocialAccount(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.provider = str;
                this.profileUrl = str2;
                this.imageUrl = str3;
                this.username = str4;
            }

            public static /* synthetic */ SocialAccount copy$default(SocialAccount socialAccount, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = socialAccount.provider;
                }
                if ((i & 2) != 0) {
                    str2 = socialAccount.profileUrl;
                }
                if ((i & 4) != 0) {
                    str3 = socialAccount.imageUrl;
                }
                if ((i & 8) != 0) {
                    str4 = socialAccount.username;
                }
                return socialAccount.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.provider;
            }

            public final String component2() {
                return this.profileUrl;
            }

            public final String component3() {
                return this.imageUrl;
            }

            public final String component4() {
                return this.username;
            }

            public final SocialAccount copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new SocialAccount(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SocialAccount)) {
                    return false;
                }
                SocialAccount socialAccount = (SocialAccount) obj;
                return xj5.a(this.provider, socialAccount.provider) && xj5.a(this.profileUrl, socialAccount.profileUrl) && xj5.a(this.imageUrl, socialAccount.imageUrl) && xj5.a(this.username, socialAccount.username);
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final String getProfileUrl() {
                return this.profileUrl;
            }

            public final String getProvider() {
                return this.provider;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.username.hashCode() + ru3.c(ru3.c(this.provider.hashCode() * 31, 31, this.profileUrl), 31, this.imageUrl);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SocialAccount(provider=");
                sb.append(this.provider);
                sb.append(", profileUrl=");
                sb.append(this.profileUrl);
                sb.append(", imageUrl=");
                sb.append(this.imageUrl);
                sb.append(", username=");
                return wu0.a(sb, this.username, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public enum Style {
            UNKNOWN,
            H1,
            PARAGRAPH,
            GREETING,
            INTRO,
            QUOTE,
            CAPTION;

            private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

            public static nl3<Style> getEntries() {
                return $ENTRIES;
            }
        }

        public Expanded(AvatarDetails avatarDetails, List<Body> list, List<Footer> list2, List<SocialAccount> list3, String str) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            str.getClass();
            this.avatarDetails = avatarDetails;
            this.body = list;
            this.footer = list2;
            this.socialAccounts = list3;
            this.title = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Expanded copy$default(Expanded expanded, AvatarDetails avatarDetails, List list, List list2, List list3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                avatarDetails = expanded.avatarDetails;
            }
            if ((i & 2) != 0) {
                list = expanded.body;
            }
            if ((i & 4) != 0) {
                list2 = expanded.footer;
            }
            if ((i & 8) != 0) {
                list3 = expanded.socialAccounts;
            }
            if ((i & 16) != 0) {
                str = expanded.title;
            }
            String str2 = str;
            List list4 = list2;
            return expanded.copy(avatarDetails, list, list4, list3, str2);
        }

        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        public final List<Body> component2() {
            return this.body;
        }

        public final List<Footer> component3() {
            return this.footer;
        }

        public final List<SocialAccount> component4() {
            return this.socialAccounts;
        }

        public final String component5() {
            return this.title;
        }

        public final Expanded copy(AvatarDetails avatarDetails, List<Body> list, List<Footer> list2, List<SocialAccount> list3, String str) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            str.getClass();
            return new Expanded(avatarDetails, list, list2, list3, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) obj;
            return xj5.a(this.avatarDetails, expanded.avatarDetails) && xj5.a(this.body, expanded.body) && xj5.a(this.footer, expanded.footer) && xj5.a(this.socialAccounts, expanded.socialAccounts) && xj5.a(this.title, expanded.title);
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final List<Body> getBody() {
            return this.body;
        }

        public final List<Footer> getFooter() {
            return this.footer;
        }

        public final List<SocialAccount> getSocialAccounts() {
            return this.socialAccounts;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            return this.title.hashCode() + ho2.a(ho2.a(ho2.a((avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31, 31, this.body), 31, this.footer), 31, this.socialAccounts);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Expanded(avatarDetails=");
            sb.append(this.avatarDetails);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", socialAccounts=");
            sb.append(this.socialAccounts);
            sb.append(", title=");
            return wu0.a(sb, this.title, ')');
        }
    }

    public Header(String str, String str2, String str3, String str4, String str5, String str6, Collapsed collapsed, boolean z, Expanded expanded, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        collapsed.getClass();
        this.backgroundColor = str;
        this.backgroundColorDark = str2;
        this.foregroundPrimaryColor = str3;
        this.foregroundPrimaryColorDark = str4;
        this.foregroundSecondaryColor = str5;
        this.foregroundSecondaryColorDark = str6;
        this.collapsed = collapsed;
        this.displayActiveIndicator = z;
        this.expanded = expanded;
        this.useBotHeader = z2;
        this.hideGreeting = z3;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, String str4, String str5, String str6, Collapsed collapsed, boolean z, Expanded expanded, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = header.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = header.backgroundColorDark;
        }
        if ((i & 4) != 0) {
            str3 = header.foregroundPrimaryColor;
        }
        if ((i & 8) != 0) {
            str4 = header.foregroundPrimaryColorDark;
        }
        if ((i & 16) != 0) {
            str5 = header.foregroundSecondaryColor;
        }
        if ((i & 32) != 0) {
            str6 = header.foregroundSecondaryColorDark;
        }
        if ((i & 64) != 0) {
            collapsed = header.collapsed;
        }
        if ((i & 128) != 0) {
            z = header.displayActiveIndicator;
        }
        if ((i & 256) != 0) {
            expanded = header.expanded;
        }
        if ((i & 512) != 0) {
            z2 = header.useBotHeader;
        }
        if ((i & 1024) != 0) {
            z3 = header.hideGreeting;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        Expanded expanded2 = expanded;
        String str7 = str6;
        Collapsed collapsed2 = collapsed;
        String str8 = str5;
        String str9 = str3;
        return header.copy(str, str2, str9, str4, str8, str7, collapsed2, z6, expanded2, z4, z5);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final boolean component10() {
        return this.useBotHeader;
    }

    public final boolean component11() {
        return this.hideGreeting;
    }

    public final String component2() {
        return this.backgroundColorDark;
    }

    public final String component3() {
        return this.foregroundPrimaryColor;
    }

    public final String component4() {
        return this.foregroundPrimaryColorDark;
    }

    public final String component5() {
        return this.foregroundSecondaryColor;
    }

    public final String component6() {
        return this.foregroundSecondaryColorDark;
    }

    public final Collapsed component7() {
        return this.collapsed;
    }

    public final boolean component8() {
        return this.displayActiveIndicator;
    }

    public final Expanded component9() {
        return this.expanded;
    }

    public final Header copy(String str, String str2, String str3, String str4, String str5, String str6, Collapsed collapsed, boolean z, Expanded expanded, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        collapsed.getClass();
        return new Header(str, str2, str3, str4, str5, str6, collapsed, z, expanded, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return xj5.a(this.backgroundColor, header.backgroundColor) && xj5.a(this.backgroundColorDark, header.backgroundColorDark) && xj5.a(this.foregroundPrimaryColor, header.foregroundPrimaryColor) && xj5.a(this.foregroundPrimaryColorDark, header.foregroundPrimaryColorDark) && xj5.a(this.foregroundSecondaryColor, header.foregroundSecondaryColor) && xj5.a(this.foregroundSecondaryColorDark, header.foregroundSecondaryColorDark) && xj5.a(this.collapsed, header.collapsed) && this.displayActiveIndicator == header.displayActiveIndicator && xj5.a(this.expanded, header.expanded) && this.useBotHeader == header.useBotHeader && this.hideGreeting == header.hideGreeting;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final Collapsed getCollapsed() {
        return this.collapsed;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final Expanded getExpanded() {
        return this.expanded;
    }

    public final String getForegroundPrimaryColor() {
        return this.foregroundPrimaryColor;
    }

    public final String getForegroundPrimaryColorDark() {
        return this.foregroundPrimaryColorDark;
    }

    public final String getForegroundSecondaryColor() {
        return this.foregroundSecondaryColor;
    }

    public final String getForegroundSecondaryColorDark() {
        return this.foregroundSecondaryColorDark;
    }

    public final boolean getHideGreeting() {
        return this.hideGreeting;
    }

    public final boolean getUseBotHeader() {
        return this.useBotHeader;
    }

    public int hashCode() {
        int iA = uo2.a((this.collapsed.hashCode() + ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(this.backgroundColor.hashCode() * 31, 31, this.backgroundColorDark), 31, this.foregroundPrimaryColor), 31, this.foregroundPrimaryColorDark), 31, this.foregroundSecondaryColor), 31, this.foregroundSecondaryColorDark)) * 31, this.displayActiveIndicator, 31);
        Expanded expanded = this.expanded;
        return Boolean.hashCode(this.hideGreeting) + uo2.a((iA + (expanded == null ? 0 : expanded.hashCode())) * 31, this.useBotHeader, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Header(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", backgroundColorDark=");
        sb.append(this.backgroundColorDark);
        sb.append(", foregroundPrimaryColor=");
        sb.append(this.foregroundPrimaryColor);
        sb.append(", foregroundPrimaryColorDark=");
        sb.append(this.foregroundPrimaryColorDark);
        sb.append(", foregroundSecondaryColor=");
        sb.append(this.foregroundSecondaryColor);
        sb.append(", foregroundSecondaryColorDark=");
        sb.append(this.foregroundSecondaryColorDark);
        sb.append(", collapsed=");
        sb.append(this.collapsed);
        sb.append(", displayActiveIndicator=");
        sb.append(this.displayActiveIndicator);
        sb.append(", expanded=");
        sb.append(this.expanded);
        sb.append(", useBotHeader=");
        sb.append(this.useBotHeader);
        sb.append(", hideGreeting=");
        return pi1.a(sb, this.hideGreeting, ')');
    }
}
