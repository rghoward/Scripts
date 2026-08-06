package io.intercom.android.sdk.survey.ui.models;

import com.intercom.twig.BuildConfig;
import defpackage.av;
import defpackage.bl7;
import defpackage.e44;
import defpackage.e96;
import defpackage.fh0;
import defpackage.h37;
import defpackage.os2;
import defpackage.qq2;
import defpackage.qw;
import defpackage.th1;
import defpackage.u;
import defpackage.ws0;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.yc;
import defpackage.yz9;
import defpackage.zc6;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Answer {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public DateTimeAnswer(long j, int i, int i2) {
            super(null);
            this.date = j;
            this.hours = i;
            this.minutes = i2;
        }

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = dateTimeAnswer.date;
            }
            if ((i3 & 2) != 0) {
                i = dateTimeAnswer.hours;
            }
            if ((i3 & 4) != 0) {
                i2 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j, i, i2);
        }

        private final String formatTime(int i) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            if (i < 0) {
                i = 0;
            }
            String str = decimalFormat.format(Integer.valueOf(i));
            str.getClass();
            return str;
        }

        public final long component1() {
            return this.date;
        }

        public final int component2() {
            return this.hours;
        }

        public final int component3() {
            return this.minutes;
        }

        public final DateTimeAnswer copy(long j, int i, int i2) {
            return new DateTimeAnswer(j, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) obj;
            return this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes;
        }

        public final String getAnswer() {
            StringBuilder sb = new StringBuilder();
            sb.append(getDateAsString());
            sb.append('T');
            sb.append(formatTime(this.hours));
            sb.append(':');
            return av.a(sb, formatTime(this.minutes), ":00Z");
        }

        public final long getDate() {
            return this.date;
        }

        public final String getDateAsString() {
            long j = this.date;
            if (j == -1) {
                return BuildConfig.FLAVOR;
            }
            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j, "YYYY-MM-dd");
            timeInMillisAsDate.getClass();
            return timeInMillisAsDate;
        }

        public final int getHours() {
            return this.hours;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.date);
            sb.append(this.hours);
            sb.append(this.minutes);
            return sb.toString().length();
        }

        public final String getLocalTime() {
            int i;
            int i2 = this.hours;
            if (i2 == -1 || (i = this.minutes) == -1) {
                return BuildConfig.FLAVOR;
            }
            String fromUtcTime = TimeFormatter.formatFromUtcTime(i2, i);
            fromUtcTime.getClass();
            return fromUtcTime;
        }

        public final int getMinutes() {
            return this.minutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutes) + os2.a(this.hours, Long.hashCode(this.date) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DateTimeAnswer(date=");
            sb.append(this.date);
            sb.append(", hours=");
            sb.append(this.hours);
            sb.append(", minutes=");
            return e44.a(sb, this.minutes, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SingleAnswer extends Answer {
        public static final int $stable = 0;
        private final String answer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAnswer(String str) {
            super(null);
            str.getClass();
            this.answer = str;
        }

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        public final String component1() {
            return this.answer;
        }

        public final SingleAnswer copy(String str) {
            str.getClass();
            return new SingleAnswer(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleAnswer) && xj5.a(this.answer, ((SingleAnswer) obj).answer);
        }

        public final String getAnswer() {
            return this.answer;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.answer.length();
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("SingleAnswer(answer="), this.answer, ')');
        }
    }

    public /* synthetic */ Answer(qq2 qq2Var) {
        this();
    }

    public abstract int getLength();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MediaAnswer extends Answer {
        public static final int $stable = 8;
        private final List<MediaItem> mediaItems;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class MediaItem {
            public static final int $stable = 8;
            private final h37 _uploadStatus$delegate;
            private final MediaData.Media data;
            private final yz9 uploadStatus$delegate;

            public MediaItem(MediaData.Media media) {
                media.getClass();
                this.data = media;
                this._uploadStatus$delegate = bl7.i(FileUploadStatus.None.INSTANCE);
                this.uploadStatus$delegate = bl7.f(new qw(0, this));
            }

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i, Object obj) {
                if ((i & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus$delegate.getValue();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus$delegate.setValue(fileUploadStatus);
            }

            public final MediaData.Media component1() {
                return this.data;
            }

            public final MediaItem copy(MediaData.Media media) {
                media.getClass();
                return new MediaItem(media);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MediaItem) && xj5.a(this.data, ((MediaItem) obj).data);
            }

            public final MediaData.Media getData() {
                return this.data;
            }

            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus$delegate.getValue();
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public final void setUploadStatus(FileUploadStatus fileUploadStatus) {
                fileUploadStatus.getClass();
                set_uploadStatus(fileUploadStatus);
            }

            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAnswer(List<MediaItem> list) {
            super(null);
            list.getClass();
            this.mediaItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        public final MediaAnswer copy(List<MediaItem> list) {
            list.getClass();
            return new MediaAnswer(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaAnswer) && xj5.a(this.mediaItems, ((MediaAnswer) obj).mediaItems);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.mediaItems.size();
        }

        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        public String toString() {
            return zc6.a(new StringBuilder("MediaAnswer(mediaItems="), this.mediaItems, ')');
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Error extends FileUploadStatus {
                public static final int $stable = 8;
                private final FileUploadError error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(FileUploadError fileUploadError) {
                    super(null);
                    fileUploadError.getClass();
                    this.error = fileUploadError;
                }

                public static /* synthetic */ Error copy$default(Error error, FileUploadError fileUploadError, int i, Object obj) {
                    if ((i & 1) != 0) {
                        fileUploadError = error.error;
                    }
                    return error.copy(fileUploadError);
                }

                public final FileUploadError component1() {
                    return this.error;
                }

                public final Error copy(FileUploadError fileUploadError) {
                    fileUploadError.getClass();
                    return new Error(fileUploadError);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && xj5.a(this.error, ((Error) obj).error);
                }

                public final FileUploadError getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Error(error=" + this.error + ')';
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;
                public static final None INSTANCE = new None();

                private None() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Success extends FileUploadStatus {
                public static final int $stable = 0;
                private final long id;

                public Success(long j) {
                    super(null);
                    this.id = j;
                }

                public static /* synthetic */ Success copy$default(Success success, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = success.id;
                    }
                    return success.copy(j);
                }

                public final long component1() {
                    return this.id;
                }

                public final Success copy(long j) {
                    return new Success(j);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && this.id == ((Success) obj).id;
                }

                public final long getId() {
                    return this.id;
                }

                public int hashCode() {
                    return Long.hashCode(this.id);
                }

                public String toString() {
                    return fh0.b(new StringBuilder("Success(id="), this.id, ')');
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super(null);
                }
            }

            public /* synthetic */ FileUploadStatus(qq2 qq2Var) {
                this();
            }

            private FileUploadStatus() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static abstract class FileUploadError {
            public static final int $stable = 8;
            private final List<StringProvider.StringRes> errorMessages;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileTooLarge(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFailed(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }

            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            public /* synthetic */ FileUploadError(List list, qq2 qq2Var) {
                this(list);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MultipleAnswer extends Answer {
        public static final int $stable = 8;
        private final Set<String> answers;
        private final OtherAnswer otherAnswer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(Set<String> set, OtherAnswer otherAnswer) {
            super(null);
            set.getClass();
            otherAnswer.getClass();
            this.answers = set;
            this.otherAnswer = otherAnswer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set set, OtherAnswer otherAnswer, int i, Object obj) {
            if ((i & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i & 2) != 0) {
                otherAnswer = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence getLength$lambda$1(String str) {
            str.getClass();
            return str;
        }

        public final Set<String> component1() {
            return this.answers;
        }

        public final OtherAnswer component2() {
            return this.otherAnswer;
        }

        public final MultipleAnswer copy(Set<String> set, OtherAnswer otherAnswer) {
            set.getClass();
            otherAnswer.getClass();
            return new MultipleAnswer(set, otherAnswer);
        }

        public final Answer copyWithAnswerToggled(String str) {
            str.getClass();
            Set setW = th1.W(this.answers);
            if (this.answers.contains(str)) {
                setW.remove(str);
            } else {
                setW.add(str);
            }
            return (setW.isEmpty() && (this.otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, setW, null, 2, null);
        }

        public final Answer copyWithOther(OtherAnswer otherAnswer) {
            otherAnswer.getClass();
            return (this.answers.isEmpty() && (otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, null, otherAnswer, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) obj;
            return xj5.a(this.answers, multipleAnswer.answers) && xj5.a(this.otherAnswer, multipleAnswer.otherAnswer);
        }

        public final List<String> getAnswers() {
            e96 e96VarF = ws0.f();
            e96VarF.addAll(th1.T(this.answers));
            OtherAnswer otherAnswer = this.otherAnswer;
            if (!xj5.a(otherAnswer, OtherAnswer.NotSelected.INSTANCE)) {
                if (xj5.a(otherAnswer, OtherAnswer.SelectedNoText.INSTANCE)) {
                    e96VarF.add("Other");
                } else {
                    if (!(otherAnswer instanceof OtherAnswer.SelectedWithText)) {
                        u.b();
                        return null;
                    }
                    e96VarF.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                }
            }
            return ws0.e(e96VarF);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return th1.F(this.answers, null, null, null, new yc(1), 31).length();
        }

        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public int hashCode() {
            return this.otherAnswer.hashCode() + (this.answers.hashCode() * 31);
        }

        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedWithText(String str) {
                    super(null);
                    str.getClass();
                    this.text = str;
                }

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                public final String component1() {
                    return this.text;
                }

                public final SelectedWithText copy(String str) {
                    str.getClass();
                    return new SelectedWithText(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SelectedWithText) && xj5.a(this.text, ((SelectedWithText) obj).text);
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @Override // io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer
                public String toString() {
                    return this.text;
                }
            }

            public /* synthetic */ OtherAnswer(qq2 qq2Var) {
                this();
            }

            public String toString() {
                return BuildConfig.FLAVOR;
            }

            private OtherAnswer() {
            }
        }

        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer otherAnswer, int i, qq2 qq2Var) {
            this(set, (i & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : otherAnswer);
        }

        /* JADX INFO: renamed from: getAnswers, reason: collision with other method in class */
        public final Set<String> m457getAnswers() {
            return this.answers;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super(null);
            }
        }

        private NoAnswer() {
            super(null);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return 0;
        }

        public /* synthetic */ NoAnswer(qq2 qq2Var) {
            this();
        }
    }

    private Answer() {
    }
}
