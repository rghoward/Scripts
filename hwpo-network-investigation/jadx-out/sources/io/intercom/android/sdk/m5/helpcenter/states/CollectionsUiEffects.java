package io.intercom.android.sdk.m5.helpcenter.states;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionsUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NavigateToCollectionContent extends CollectionsUiEffects {
        public static final int $stable = 0;
        private final String collectionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCollectionContent(String str) {
            super(null);
            str.getClass();
            this.collectionId = str;
        }

        public static /* synthetic */ NavigateToCollectionContent copy$default(NavigateToCollectionContent navigateToCollectionContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCollectionContent.collectionId;
            }
            return navigateToCollectionContent.copy(str);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final NavigateToCollectionContent copy(String str) {
            str.getClass();
            return new NavigateToCollectionContent(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToCollectionContent) && xj5.a(this.collectionId, ((NavigateToCollectionContent) obj).collectionId);
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public int hashCode() {
            return this.collectionId.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("NavigateToCollectionContent(collectionId="), this.collectionId, ')');
        }
    }

    public /* synthetic */ CollectionsUiEffects(qq2 qq2Var) {
        this();
    }

    private CollectionsUiEffects() {
    }
}
