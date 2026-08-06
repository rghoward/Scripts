package io.intercom.android.sdk;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomContent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Article extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Article(String str) {
            super(null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Article copy$default(Article article, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = article.id;
            }
            return article.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Article copy(String str) {
            str.getClass();
            return new Article(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Article) && xj5.a(this.id, ((Article) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Article(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Carousel extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Carousel(String str) {
            super(null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = carousel.id;
            }
            return carousel.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Carousel copy(String str) {
            str.getClass();
            return new Carousel(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Carousel) && xj5.a(this.id, ((Carousel) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Carousel(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Conversation extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(String str) {
            super(null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversation.id;
            }
            return conversation.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Conversation copy(String str) {
            str.getClass();
            return new Conversation(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && xj5.a(this.id, ((Conversation) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Conversation(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HelpCenterCollections extends IntercomContent {
        public static final int $stable = 8;
        private final List<String> ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollections(List<String> list) {
            super(null);
            list.getClass();
            this.ids = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        public final List<String> component1() {
            return this.ids;
        }

        public final HelpCenterCollections copy(List<String> list) {
            list.getClass();
            return new HelpCenterCollections(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpCenterCollections) && xj5.a(this.ids, ((HelpCenterCollections) obj).ids);
        }

        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        public String toString() {
            return zc6.a(new StringBuilder("HelpCenterCollections(ids="), this.ids, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Survey extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Survey(String str) {
            super(null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Survey copy$default(Survey survey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = survey.id;
            }
            return survey.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Survey copy(String str) {
            str.getClass();
            return new Survey(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Survey) && xj5.a(this.id, ((Survey) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Survey(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Ticket extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ticket(String str) {
            super(null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticket.id;
            }
            return ticket.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Ticket copy(String str) {
            str.getClass();
            return new Ticket(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ticket) && xj5.a(this.id, ((Ticket) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Ticket(id="), this.id, ')');
        }
    }

    public /* synthetic */ IntercomContent(qq2 qq2Var) {
        this();
    }

    private IntercomContent() {
    }
}
