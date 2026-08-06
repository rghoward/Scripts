package io.intercom.android.sdk.m5.home.states;

import defpackage.a83;
import defpackage.h44;
import defpackage.ho;
import defpackage.ho2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uh1;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeUiState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends HomeUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final ErrorHeader header;
        private final PoweredBy poweredBy;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ErrorHeader {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final String foregroundColor;

            public ErrorHeader(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.backgroundColor = str;
                this.foregroundColor = str2;
            }

            public static /* synthetic */ ErrorHeader copy$default(ErrorHeader errorHeader, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = errorHeader.backgroundColor;
                }
                if ((i & 2) != 0) {
                    str2 = errorHeader.foregroundColor;
                }
                return errorHeader.copy(str, str2);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final String component2() {
                return this.foregroundColor;
            }

            public final ErrorHeader copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new ErrorHeader(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorHeader)) {
                    return false;
                }
                ErrorHeader errorHeader = (ErrorHeader) obj;
                return xj5.a(this.backgroundColor, errorHeader.backgroundColor) && xj5.a(this.foregroundColor, errorHeader.foregroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getForegroundColor() {
                return this.foregroundColor;
            }

            public int hashCode() {
                return this.foregroundColor.hashCode() + (this.backgroundColor.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ErrorHeader(backgroundColor=");
                sb.append(this.backgroundColor);
                sb.append(", foregroundColor=");
                return wu0.a(sb, this.foregroundColor, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PoweredBy poweredBy, ErrorState errorState, ErrorHeader errorHeader) {
            super(null);
            errorState.getClass();
            errorHeader.getClass();
            this.poweredBy = poweredBy;
            this.errorState = errorState;
            this.header = errorHeader;
        }

        public static /* synthetic */ Error copy$default(Error error, PoweredBy poweredBy, ErrorState errorState, ErrorHeader errorHeader, int i, Object obj) {
            if ((i & 1) != 0) {
                poweredBy = error.poweredBy;
            }
            if ((i & 2) != 0) {
                errorState = error.errorState;
            }
            if ((i & 4) != 0) {
                errorHeader = error.header;
            }
            return error.copy(poweredBy, errorState, errorHeader);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final ErrorState component2() {
            return this.errorState;
        }

        public final ErrorHeader component3() {
            return this.header;
        }

        public final Error copy(PoweredBy poweredBy, ErrorState errorState, ErrorHeader errorHeader) {
            errorState.getClass();
            errorHeader.getClass();
            return new Error(poweredBy, errorState, errorHeader);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return xj5.a(this.poweredBy, error.poweredBy) && xj5.a(this.errorState, error.errorState) && xj5.a(this.header, error.header);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final ErrorHeader getHeader() {
            return this.header;
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            int iHashCode = poweredBy == null ? 0 : poweredBy.hashCode();
            return this.header.hashCode() + ((this.errorState.hashCode() + (iHashCode * 31)) * 31);
        }

        public String toString() {
            return "Error(poweredBy=" + this.poweredBy + ", errorState=" + this.errorState + ", header=" + this.header + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends HomeUiState {
        public static final int $stable = 0;
        private final PoweredBy poweredBy;

        public Loading(PoweredBy poweredBy) {
            super(null);
            this.poweredBy = poweredBy;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, PoweredBy poweredBy, int i, Object obj) {
            if ((i & 1) != 0) {
                poweredBy = loading.poweredBy;
            }
            return loading.copy(poweredBy);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final Loading copy(PoweredBy poweredBy) {
            return new Loading(poweredBy);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && xj5.a(this.poweredBy, ((Loading) obj).poweredBy);
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            if (poweredBy == null) {
                return 0;
            }
            return poweredBy.hashCode();
        }

        public String toString() {
            return "Loading(poweredBy=" + this.poweredBy + ')';
        }
    }

    public /* synthetic */ HomeUiState(qq2 qq2Var) {
        this();
    }

    public abstract PoweredBy getPoweredBy();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content extends HomeUiState {
        public static final int $stable = 8;
        private final List<AvatarWrapper> adminsAvatars;
        private final AvatarWrapper botAvatar;
        private final List<HomeCards> cards;
        private final ContentHeader header;
        private final PoweredBy poweredBy;
        private final boolean teammateAccessEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(PoweredBy poweredBy, List<? extends HomeCards> list, List<AvatarWrapper> list2, AvatarWrapper avatarWrapper, boolean z, ContentHeader contentHeader) {
            super(null);
            list.getClass();
            list2.getClass();
            contentHeader.getClass();
            this.poweredBy = poweredBy;
            this.cards = list;
            this.adminsAvatars = list2;
            this.botAvatar = avatarWrapper;
            this.teammateAccessEnabled = z;
            this.header = contentHeader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, PoweredBy poweredBy, List list, List list2, AvatarWrapper avatarWrapper, boolean z, ContentHeader contentHeader, int i, Object obj) {
            if ((i & 1) != 0) {
                poweredBy = content.poweredBy;
            }
            if ((i & 2) != 0) {
                list = content.cards;
            }
            if ((i & 4) != 0) {
                list2 = content.adminsAvatars;
            }
            if ((i & 8) != 0) {
                avatarWrapper = content.botAvatar;
            }
            if ((i & 16) != 0) {
                z = content.teammateAccessEnabled;
            }
            if ((i & 32) != 0) {
                contentHeader = content.header;
            }
            boolean z2 = z;
            ContentHeader contentHeader2 = contentHeader;
            return content.copy(poweredBy, list, list2, avatarWrapper, z2, contentHeader2);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final List<HomeCards> component2() {
            return this.cards;
        }

        public final List<AvatarWrapper> component3() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper component4() {
            return this.botAvatar;
        }

        public final boolean component5() {
            return this.teammateAccessEnabled;
        }

        public final ContentHeader component6() {
            return this.header;
        }

        public final Content copy(PoweredBy poweredBy, List<? extends HomeCards> list, List<AvatarWrapper> list2, AvatarWrapper avatarWrapper, boolean z, ContentHeader contentHeader) {
            list.getClass();
            list2.getClass();
            contentHeader.getClass();
            return new Content(poweredBy, list, list2, avatarWrapper, z, contentHeader);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return xj5.a(this.poweredBy, content.poweredBy) && xj5.a(this.cards, content.cards) && xj5.a(this.adminsAvatars, content.adminsAvatars) && xj5.a(this.botAvatar, content.botAvatar) && this.teammateAccessEnabled == content.teammateAccessEnabled && xj5.a(this.header, content.header);
        }

        public final List<AvatarWrapper> getAdminsAvatars() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper getBotAvatar() {
            return this.botAvatar;
        }

        public final List<HomeCards> getCards() {
            return this.cards;
        }

        public final ContentHeader getHeader() {
            return this.header;
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final boolean getTeammateAccessEnabled() {
            return this.teammateAccessEnabled;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            int iA = ho2.a(ho2.a((poweredBy == null ? 0 : poweredBy.hashCode()) * 31, 31, this.cards), 31, this.adminsAvatars);
            AvatarWrapper avatarWrapper = this.botAvatar;
            return this.header.hashCode() + uo2.a((iA + (avatarWrapper != null ? avatarWrapper.hashCode() : 0)) * 31, this.teammateAccessEnabled, 31);
        }

        public String toString() {
            return "Content(poweredBy=" + this.poweredBy + ", cards=" + this.cards + ", adminsAvatars=" + this.adminsAvatars + ", botAvatar=" + this.botAvatar + ", teammateAccessEnabled=" + this.teammateAccessEnabled + ", header=" + this.header + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ContentHeader {
            public static final int $stable = 8;
            private final List<AvatarWrapper> adminsAvatars;
            private final CloseButtonColor closeButtonColor;
            private final ColoredText greeting;
            private final HeaderBackdropStyle headerBackdropStyle;
            private final HeaderBackdropStyle headerBackdropStyleDark;
            private final ColoredText intro;
            private final String logoDarkUrl;
            private final String logoUrl;
            private final boolean showAvatars;
            private final boolean showLogo;

            public ContentHeader(boolean z, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List<AvatarWrapper> list, CloseButtonColor closeButtonColor) {
                coloredText.getClass();
                coloredText2.getClass();
                headerBackdropStyle.getClass();
                list.getClass();
                closeButtonColor.getClass();
                this.showLogo = z;
                this.logoUrl = str;
                this.logoDarkUrl = str2;
                this.greeting = coloredText;
                this.intro = coloredText2;
                this.headerBackdropStyle = headerBackdropStyle;
                this.headerBackdropStyleDark = headerBackdropStyle2;
                this.showAvatars = z2;
                this.adminsAvatars = list;
                this.closeButtonColor = closeButtonColor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ContentHeader copy$default(ContentHeader contentHeader, boolean z, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List list, CloseButtonColor closeButtonColor, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = contentHeader.showLogo;
                }
                if ((i & 2) != 0) {
                    str = contentHeader.logoUrl;
                }
                if ((i & 4) != 0) {
                    str2 = contentHeader.logoDarkUrl;
                }
                if ((i & 8) != 0) {
                    coloredText = contentHeader.greeting;
                }
                if ((i & 16) != 0) {
                    coloredText2 = contentHeader.intro;
                }
                if ((i & 32) != 0) {
                    headerBackdropStyle = contentHeader.headerBackdropStyle;
                }
                if ((i & 64) != 0) {
                    headerBackdropStyle2 = contentHeader.headerBackdropStyleDark;
                }
                if ((i & 128) != 0) {
                    z2 = contentHeader.showAvatars;
                }
                if ((i & 256) != 0) {
                    list = contentHeader.adminsAvatars;
                }
                if ((i & 512) != 0) {
                    closeButtonColor = contentHeader.closeButtonColor;
                }
                List list2 = list;
                CloseButtonColor closeButtonColor2 = closeButtonColor;
                HeaderBackdropStyle headerBackdropStyle3 = headerBackdropStyle2;
                boolean z3 = z2;
                ColoredText coloredText3 = coloredText2;
                HeaderBackdropStyle headerBackdropStyle4 = headerBackdropStyle;
                return contentHeader.copy(z, str, str2, coloredText, coloredText3, headerBackdropStyle4, headerBackdropStyle3, z3, list2, closeButtonColor2);
            }

            public final boolean component1() {
                return this.showLogo;
            }

            public final CloseButtonColor component10() {
                return this.closeButtonColor;
            }

            public final String component2() {
                return this.logoUrl;
            }

            public final String component3() {
                return this.logoDarkUrl;
            }

            public final ColoredText component4() {
                return this.greeting;
            }

            public final ColoredText component5() {
                return this.intro;
            }

            public final HeaderBackdropStyle component6() {
                return this.headerBackdropStyle;
            }

            public final HeaderBackdropStyle component7() {
                return this.headerBackdropStyleDark;
            }

            public final boolean component8() {
                return this.showAvatars;
            }

            public final List<AvatarWrapper> component9() {
                return this.adminsAvatars;
            }

            public final ContentHeader copy(boolean z, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List<AvatarWrapper> list, CloseButtonColor closeButtonColor) {
                coloredText.getClass();
                coloredText2.getClass();
                headerBackdropStyle.getClass();
                list.getClass();
                closeButtonColor.getClass();
                return new ContentHeader(z, str, str2, coloredText, coloredText2, headerBackdropStyle, headerBackdropStyle2, z2, list, closeButtonColor);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentHeader)) {
                    return false;
                }
                ContentHeader contentHeader = (ContentHeader) obj;
                return this.showLogo == contentHeader.showLogo && xj5.a(this.logoUrl, contentHeader.logoUrl) && xj5.a(this.logoDarkUrl, contentHeader.logoDarkUrl) && xj5.a(this.greeting, contentHeader.greeting) && xj5.a(this.intro, contentHeader.intro) && xj5.a(this.headerBackdropStyle, contentHeader.headerBackdropStyle) && xj5.a(this.headerBackdropStyleDark, contentHeader.headerBackdropStyleDark) && this.showAvatars == contentHeader.showAvatars && xj5.a(this.adminsAvatars, contentHeader.adminsAvatars) && xj5.a(this.closeButtonColor, contentHeader.closeButtonColor);
            }

            public final List<AvatarWrapper> getAdminsAvatars() {
                return this.adminsAvatars;
            }

            public final CloseButtonColor getCloseButtonColor() {
                return this.closeButtonColor;
            }

            public final ColoredText getGreeting() {
                return this.greeting;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyle() {
                return this.headerBackdropStyle;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyleDark() {
                return this.headerBackdropStyleDark;
            }

            public final ColoredText getIntro() {
                return this.intro;
            }

            public final String getLogoDarkUrl() {
                return this.logoDarkUrl;
            }

            public final String getLogoUrl() {
                return this.logoUrl;
            }

            public final boolean getShowAvatars() {
                return this.showAvatars;
            }

            public final boolean getShowLogo() {
                return this.showLogo;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.showLogo) * 31;
                String str = this.logoUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.logoDarkUrl;
                int iHashCode3 = (this.headerBackdropStyle.hashCode() + ((this.intro.hashCode() + ((this.greeting.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
                HeaderBackdropStyle headerBackdropStyle = this.headerBackdropStyleDark;
                return this.closeButtonColor.hashCode() + ho2.a(uo2.a((iHashCode3 + (headerBackdropStyle != null ? headerBackdropStyle.hashCode() : 0)) * 31, this.showAvatars, 31), 31, this.adminsAvatars);
            }

            public String toString() {
                return "ContentHeader(showLogo=" + this.showLogo + ", logoUrl=" + this.logoUrl + ", logoDarkUrl=" + this.logoDarkUrl + ", greeting=" + this.greeting + ", intro=" + this.intro + ", headerBackdropStyle=" + this.headerBackdropStyle + ", headerBackdropStyleDark=" + this.headerBackdropStyleDark + ", showAvatars=" + this.showAvatars + ", adminsAvatars=" + this.adminsAvatars + ", closeButtonColor=" + this.closeButtonColor + ')';
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static abstract class HeaderBackdropStyle {
                public static final int $stable = 0;

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class Gradient extends HeaderBackdropStyle {
                    public static final int $stable = 8;
                    private final List<uh1> colors;
                    private final boolean fade;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Gradient(List<uh1> list, boolean z) {
                        super(null);
                        list.getClass();
                        this.colors = list;
                        this.fade = z;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = gradient.colors;
                        }
                        if ((i & 2) != 0) {
                            z = gradient.fade;
                        }
                        return gradient.copy(list, z);
                    }

                    public final List<uh1> component1() {
                        return this.colors;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    public final Gradient copy(List<uh1> list, boolean z) {
                        list.getClass();
                        return new Gradient(list, z);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Gradient)) {
                            return false;
                        }
                        Gradient gradient = (Gradient) obj;
                        return xj5.a(this.colors, gradient.colors) && this.fade == gradient.fade;
                    }

                    public final List<uh1> getColors() {
                        return this.colors;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        return Boolean.hashCode(this.fade) + (this.colors.hashCode() * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("Gradient(colors=");
                        sb.append(this.colors);
                        sb.append(", fade=");
                        return pi1.a(sb, this.fade, ')');
                    }
                }

                public /* synthetic */ HeaderBackdropStyle(qq2 qq2Var) {
                    this();
                }

                public abstract boolean getFade();

                private HeaderBackdropStyle() {
                }

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class Solid extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final long color;
                    private final boolean fade;

                    private Solid(long j, boolean z) {
                        super(null);
                        this.color = j;
                        this.fade = z;
                    }

                    /* JADX INFO: renamed from: copy-DxMtmZc$default, reason: not valid java name */
                    public static /* synthetic */ Solid m331copyDxMtmZc$default(Solid solid, long j, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = solid.color;
                        }
                        if ((i & 2) != 0) {
                            z = solid.fade;
                        }
                        return solid.m333copyDxMtmZc(j, z);
                    }

                    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
                    public final long m332component10d7_KjU() {
                        return this.color;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: copy-DxMtmZc, reason: not valid java name */
                    public final Solid m333copyDxMtmZc(long j, boolean z) {
                        return new Solid(j, z, null);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Solid)) {
                            return false;
                        }
                        Solid solid = (Solid) obj;
                        return uh1.c(this.color, solid.color) && this.fade == solid.fade;
                    }

                    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
                    public final long m334getColor0d7_KjU() {
                        return this.color;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        long j = this.color;
                        int i = uh1.l;
                        return Boolean.hashCode(this.fade) + (Long.hashCode(j) * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("Solid(color=");
                        a83.b(this.color, ", fade=", sb);
                        return pi1.a(sb, this.fade, ')');
                    }

                    public /* synthetic */ Solid(long j, boolean z, qq2 qq2Var) {
                        this(j, z);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class Image extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final boolean fade;
                    private final long fallbackColor;
                    private final String imageUrl;

                    private Image(long j, String str, boolean z) {
                        super(null);
                        this.fallbackColor = j;
                        this.imageUrl = str;
                        this.fade = z;
                    }

                    /* JADX INFO: renamed from: copy-ek8zF_U$default, reason: not valid java name */
                    public static /* synthetic */ Image m327copyek8zF_U$default(Image image, long j, String str, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = image.fallbackColor;
                        }
                        if ((i & 2) != 0) {
                            str = image.imageUrl;
                        }
                        if ((i & 4) != 0) {
                            z = image.fade;
                        }
                        return image.m329copyek8zF_U(j, str, z);
                    }

                    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
                    public final long m328component10d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String component2() {
                        return this.imageUrl;
                    }

                    public final boolean component3() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: copy-ek8zF_U, reason: not valid java name */
                    public final Image m329copyek8zF_U(long j, String str, boolean z) {
                        return new Image(j, str, z, null);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Image)) {
                            return false;
                        }
                        Image image = (Image) obj;
                        return uh1.c(this.fallbackColor, image.fallbackColor) && xj5.a(this.imageUrl, image.imageUrl) && this.fade == image.fade;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: getFallbackColor-0d7_KjU, reason: not valid java name */
                    public final long m330getFallbackColor0d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String getImageUrl() {
                        return this.imageUrl;
                    }

                    public int hashCode() {
                        long j = this.fallbackColor;
                        int i = uh1.l;
                        int iHashCode = Long.hashCode(j) * 31;
                        String str = this.imageUrl;
                        return Boolean.hashCode(this.fade) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("Image(fallbackColor=");
                        a83.b(this.fallbackColor, ", imageUrl=", sb);
                        sb.append(this.imageUrl);
                        sb.append(", fade=");
                        return pi1.a(sb, this.fade, ')');
                    }

                    public /* synthetic */ Image(long j, String str, boolean z, qq2 qq2Var) {
                        this(j, str, z);
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class CloseButtonColor {
                public static final int $stable = 0;
                private final String backgroundColor;
                private final float backgroundOpacity;
                private final String foregroundColor;
                private final String foregroundColorDark;

                public CloseButtonColor(String str, String str2, String str3, float f) {
                    str.getClass();
                    str2.getClass();
                    this.backgroundColor = str;
                    this.foregroundColor = str2;
                    this.foregroundColorDark = str3;
                    this.backgroundOpacity = f;
                }

                public static /* synthetic */ CloseButtonColor copy$default(CloseButtonColor closeButtonColor, String str, String str2, String str3, float f, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = closeButtonColor.backgroundColor;
                    }
                    if ((i & 2) != 0) {
                        str2 = closeButtonColor.foregroundColor;
                    }
                    if ((i & 4) != 0) {
                        str3 = closeButtonColor.foregroundColorDark;
                    }
                    if ((i & 8) != 0) {
                        f = closeButtonColor.backgroundOpacity;
                    }
                    return closeButtonColor.copy(str, str2, str3, f);
                }

                public final String component1() {
                    return this.backgroundColor;
                }

                public final String component2() {
                    return this.foregroundColor;
                }

                public final String component3() {
                    return this.foregroundColorDark;
                }

                public final float component4() {
                    return this.backgroundOpacity;
                }

                public final CloseButtonColor copy(String str, String str2, String str3, float f) {
                    str.getClass();
                    str2.getClass();
                    return new CloseButtonColor(str, str2, str3, f);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CloseButtonColor)) {
                        return false;
                    }
                    CloseButtonColor closeButtonColor = (CloseButtonColor) obj;
                    return xj5.a(this.backgroundColor, closeButtonColor.backgroundColor) && xj5.a(this.foregroundColor, closeButtonColor.foregroundColor) && xj5.a(this.foregroundColorDark, closeButtonColor.foregroundColorDark) && Float.compare(this.backgroundOpacity, closeButtonColor.backgroundOpacity) == 0;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final float getBackgroundOpacity() {
                    return this.backgroundOpacity;
                }

                public final String getForegroundColor() {
                    return this.foregroundColor;
                }

                public final String getForegroundColorDark() {
                    return this.foregroundColorDark;
                }

                public int hashCode() {
                    int iC = ru3.c(this.backgroundColor.hashCode() * 31, 31, this.foregroundColor);
                    String str = this.foregroundColorDark;
                    return Float.hashCode(this.backgroundOpacity) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("CloseButtonColor(backgroundColor=");
                    sb.append(this.backgroundColor);
                    sb.append(", foregroundColor=");
                    sb.append(this.foregroundColor);
                    sb.append(", foregroundColorDark=");
                    sb.append(this.foregroundColorDark);
                    sb.append(", backgroundOpacity=");
                    return ho.a(sb, this.backgroundOpacity, ')');
                }

                public /* synthetic */ CloseButtonColor(String str, String str2, String str3, float f, int i, qq2 qq2Var) {
                    this(str, str2, (i & 4) != 0 ? null : str3, f);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class ColoredText {
                public static final int $stable = 0;
                private final float opacity;
                private final String text;
                private final String textColorDark;
                private final String textColorLight;
                private final String textColorType;
                private final String textColorTypeDark;

                public ColoredText(String str, float f, String str2, String str3, String str4, String str5) {
                    str.getClass();
                    str5.getClass();
                    this.text = str;
                    this.opacity = f;
                    this.textColorType = str2;
                    this.textColorTypeDark = str3;
                    this.textColorDark = str4;
                    this.textColorLight = str5;
                }

                public static /* synthetic */ ColoredText copy$default(ColoredText coloredText, String str, float f, String str2, String str3, String str4, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = coloredText.text;
                    }
                    if ((i & 2) != 0) {
                        f = coloredText.opacity;
                    }
                    if ((i & 4) != 0) {
                        str2 = coloredText.textColorType;
                    }
                    if ((i & 8) != 0) {
                        str3 = coloredText.textColorTypeDark;
                    }
                    if ((i & 16) != 0) {
                        str4 = coloredText.textColorDark;
                    }
                    if ((i & 32) != 0) {
                        str5 = coloredText.textColorLight;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    return coloredText.copy(str, f, str2, str3, str6, str7);
                }

                public final String component1() {
                    return this.text;
                }

                public final float component2() {
                    return this.opacity;
                }

                public final String component3() {
                    return this.textColorType;
                }

                public final String component4() {
                    return this.textColorTypeDark;
                }

                public final String component5() {
                    return this.textColorDark;
                }

                public final String component6() {
                    return this.textColorLight;
                }

                public final ColoredText copy(String str, float f, String str2, String str3, String str4, String str5) {
                    str.getClass();
                    str5.getClass();
                    return new ColoredText(str, f, str2, str3, str4, str5);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ColoredText)) {
                        return false;
                    }
                    ColoredText coloredText = (ColoredText) obj;
                    return xj5.a(this.text, coloredText.text) && Float.compare(this.opacity, coloredText.opacity) == 0 && xj5.a(this.textColorType, coloredText.textColorType) && xj5.a(this.textColorTypeDark, coloredText.textColorTypeDark) && xj5.a(this.textColorDark, coloredText.textColorDark) && xj5.a(this.textColorLight, coloredText.textColorLight);
                }

                public final float getOpacity() {
                    return this.opacity;
                }

                public final String getText() {
                    return this.text;
                }

                public final String getTextColorDark() {
                    return this.textColorDark;
                }

                public final String getTextColorLight() {
                    return this.textColorLight;
                }

                public final String getTextColorType() {
                    return this.textColorType;
                }

                public final String getTextColorTypeDark() {
                    return this.textColorTypeDark;
                }

                public int hashCode() {
                    int iA = h44.a(this.text.hashCode() * 31, this.opacity, 31);
                    String str = this.textColorType;
                    int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.textColorTypeDark;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.textColorDark;
                    return this.textColorLight.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("ColoredText(text=");
                    sb.append(this.text);
                    sb.append(", opacity=");
                    sb.append(this.opacity);
                    sb.append(", textColorType=");
                    sb.append(this.textColorType);
                    sb.append(", textColorTypeDark=");
                    sb.append(this.textColorTypeDark);
                    sb.append(", textColorDark=");
                    sb.append(this.textColorDark);
                    sb.append(", textColorLight=");
                    return wu0.a(sb, this.textColorLight, ')');
                }

                public /* synthetic */ ColoredText(String str, float f, String str2, String str3, String str4, String str5, int i, qq2 qq2Var) {
                    this(str, f, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, str5);
                }
            }

            public /* synthetic */ ContentHeader(boolean z, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List list, CloseButtonColor closeButtonColor, int i, qq2 qq2Var) {
                this(z, str, (i & 4) != 0 ? null : str2, coloredText, coloredText2, headerBackdropStyle, (i & 64) != 0 ? null : headerBackdropStyle2, z2, list, closeButtonColor);
            }
        }
    }

    private HomeUiState() {
    }
}
