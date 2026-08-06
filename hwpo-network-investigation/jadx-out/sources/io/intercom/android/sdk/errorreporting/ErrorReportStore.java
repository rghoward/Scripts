package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import android.os.AsyncTask;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.persistence.JsonStorage;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class ErrorReportStore {
    private static final String REPORT_FILE_PATH = "intercom-error.json";
    private static final Twig TWIG = LumberMill.getLogger();
    private final File reportFile;
    private final JsonStorage storage;

    public ErrorReportStore(File file, JsonStorage jsonStorage) {
        this.reportFile = file;
        this.storage = jsonStorage;
    }

    public static ErrorReportStore create(Context context, Gson gson) {
        return new ErrorReportStore(new File(context.getCacheDir(), REPORT_FILE_PATH), new JsonStorage(gson));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendImmediately$0(Provider provider, ErrorReport errorReport) {
        ((Api) provider.get()).sendErrorReport(errorReport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readAndSendReport(final Api api) {
        this.storage.loadThenDelete(this.reportFile, ErrorReport.class, new JsonStorage.LoadHandler<ErrorReport>() { // from class: io.intercom.android.sdk.errorreporting.ErrorReportStore.2
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(ErrorReport errorReport) {
                api.sendErrorReport(errorReport);
            }
        });
    }

    public void deleteFromDisk() {
        this.storage.loadThenDelete(this.reportFile, ErrorReport.class, new JsonStorage.LoadHandler<ErrorReport>() { // from class: io.intercom.android.sdk.errorreporting.ErrorReportStore.3
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(ErrorReport errorReport) {
            }
        });
    }

    public void saveToDisk(ErrorReport errorReport) {
        this.storage.saveToFileAsJson(errorReport, this.reportFile);
    }

    public void sendImmediately(final ErrorReport errorReport, final Provider<Api> provider) {
        try {
            AsyncTask.execute(new Runnable() { // from class: io.intercom.android.sdk.errorreporting.a
                @Override // java.lang.Runnable
                public final void run() {
                    ErrorReportStore.lambda$sendImmediately$0(provider, errorReport);
                }
            });
        } catch (RejectedExecutionException e) {
            TWIG.internal("Couldn't send handled exception report: " + e);
        }
    }

    public void sendSavedReport(final Provider<Api> provider) {
        try {
            AsyncTask.execute(new Runnable() { // from class: io.intercom.android.sdk.errorreporting.ErrorReportStore.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ErrorReportStore.this.reportFile.exists()) {
                        ErrorReportStore.this.readAndSendReport((Api) provider.get());
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            TWIG.internal("Couldn't queue up sending of event: " + e);
        }
    }
}
