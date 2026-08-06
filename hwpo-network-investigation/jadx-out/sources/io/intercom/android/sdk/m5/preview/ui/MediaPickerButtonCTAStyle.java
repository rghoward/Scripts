package io.intercom.android.sdk.m5.preview.ui;

import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface MediaPickerButtonCTAStyle {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class None implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return -1011382685;
        }

        public String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TextButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        private final String ctaText;

        public TextButton(String str) {
            str.getClass();
            this.ctaText = str;
        }

        public static /* synthetic */ TextButton copy$default(TextButton textButton, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textButton.ctaText;
            }
            return textButton.copy(str);
        }

        public final String component1() {
            return this.ctaText;
        }

        public final TextButton copy(String str) {
            str.getClass();
            return new TextButton(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextButton) && xj5.a(this.ctaText, ((TextButton) obj).ctaText);
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public int hashCode() {
            return this.ctaText.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("TextButton(ctaText="), this.ctaText, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TopBarButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final TopBarButton INSTANCE = new TopBarButton();

        private TopBarButton() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TopBarButton);
        }

        public int hashCode() {
            return 2026471291;
        }

        public String toString() {
            return "TopBarButton";
        }
    }
}
