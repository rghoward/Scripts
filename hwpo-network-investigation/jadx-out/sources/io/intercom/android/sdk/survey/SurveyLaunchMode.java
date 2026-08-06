package io.intercom.android.sdk.survey;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.survey.model.SurveyData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SurveyLaunchMode {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Automatic extends SurveyLaunchMode {
        public static final int $stable = 8;
        private final SurveyData surveyData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Automatic(SurveyData surveyData) {
            super(null);
            surveyData.getClass();
            this.surveyData = surveyData;
        }

        public static /* synthetic */ Automatic copy$default(Automatic automatic, SurveyData surveyData, int i, Object obj) {
            if ((i & 1) != 0) {
                surveyData = automatic.surveyData;
            }
            return automatic.copy(surveyData);
        }

        public final SurveyData component1() {
            return this.surveyData;
        }

        public final Automatic copy(SurveyData surveyData) {
            surveyData.getClass();
            return new Automatic(surveyData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Automatic) && xj5.a(this.surveyData, ((Automatic) obj).surveyData);
        }

        public final SurveyData getSurveyData() {
            return this.surveyData;
        }

        public int hashCode() {
            return this.surveyData.hashCode();
        }

        public String toString() {
            return "Automatic(surveyData=" + this.surveyData + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Programmatic extends SurveyLaunchMode {
        public static final int $stable = 0;
        private final String surveyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Programmatic(String str) {
            super(null);
            str.getClass();
            this.surveyId = str;
        }

        public static /* synthetic */ Programmatic copy$default(Programmatic programmatic, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = programmatic.surveyId;
            }
            return programmatic.copy(str);
        }

        public final String component1() {
            return this.surveyId;
        }

        public final Programmatic copy(String str) {
            str.getClass();
            return new Programmatic(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Programmatic) && xj5.a(this.surveyId, ((Programmatic) obj).surveyId);
        }

        public final String getSurveyId() {
            return this.surveyId;
        }

        public int hashCode() {
            return this.surveyId.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Programmatic(surveyId="), this.surveyId, ')');
        }
    }

    public /* synthetic */ SurveyLaunchMode(qq2 qq2Var) {
        this();
    }

    private SurveyLaunchMode() {
    }
}
