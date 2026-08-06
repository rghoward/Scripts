package com.hwpo_training_app.leaderboards.attachments.presentation;

import defpackage.av;
import defpackage.g2b;
import defpackage.gm3;
import defpackage.ru3;
import defpackage.sk0;
import defpackage.xj5;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LeaderboardValueAttachmentsEvents {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class OpenFile extends gm3<g2b> {
        public final File b;
        public final String c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenFile(File file, String str) {
            super(g2b.a);
            str.getClass();
            this.b = file;
            this.c = str;
            this.d = "com.hwpo_training_app";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenFile)) {
                return false;
            }
            OpenFile openFile = (OpenFile) obj;
            return xj5.a(this.b, openFile.b) && xj5.a(this.c, openFile.c) && xj5.a(this.d, openFile.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ru3.c(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenFile(file=");
            sb.append(this.b);
            sb.append(", contentType=");
            sb.append(this.c);
            sb.append(", appId=");
            return av.a(sb, this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class OpenUrl extends gm3<String> {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(String str) {
            super(str);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && xj5.a(this.b, ((OpenUrl) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return sk0.c("OpenUrl(url=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowError extends gm3<String> {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(String str) {
            super(str);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && xj5.a(this.b, ((ShowError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return sk0.c("ShowError(error=", this.b, ")");
        }
    }

    private LeaderboardValueAttachmentsEvents() {
    }
}
