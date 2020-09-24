package com.iax;

import com.iax.ChainOfResponsibility.*;
import com.iax.command.AddCustomerCommand;
import com.iax.command.Button;
import com.iax.command.CustomerService;
import com.iax.iterator.BrowserHistory;
import com.iax.iterator.Iterator;
import com.iax.iteratorEx.Product;
import com.iax.iteratorEx.ProductCollection;
import com.iax.mediator.ArticlesDialogBox;
import com.iax.mediator.ListBox;
import com.iax.mediator.TextBox;
import com.iax.memento.Editor;
import com.iax.memento.History;
import com.iax.mementoEx.Document;
import com.iax.observer.Chart;
import com.iax.observer.DataSource;
import com.iax.observer.SpreadSheet;
import com.iax.state.BrushTool;
import com.iax.state.Canvas;
import com.iax.stateEx.DirectionService;
import com.iax.stateEx.WalkingMode;
import com.iax.strategy.BlackAndWhiteFilter;
import com.iax.strategy.ImageStorage;
import com.iax.strategy.JpegCompressor;
import com.iax.strategyEx.ChatClient;
import com.iax.strategyEx.DesEncryption;
import com.iax.template.TransferMoneyTask;
import com.iax.templateEx.MainWindow;
import com.iax.visitor.*;

public class Main {

    public static void memento() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
    public static void mementoEx() {
        var doc = new Document();
        var his = new com.iax.mementoEx.History();

        doc.setContent("Twice");
        doc.setFontName("Consolas");
        doc.setFontSize(12);
        his.push(doc.createState());

        doc.setFontName("Roboto");
        doc.setFontSize(26);
        his.push(doc.createState());

        doc.setContent("Sin Censura");
        doc.restore(his.pop());

        System.out.println(doc.toString());
    }

    public static void state() {
        var can = new Canvas();
        can.setCurrentTool(new BrushTool());
        can.mouseDown();
        can.mouseUp();
    }
    public static void stateEx() {
        var dir = new DirectionService();
        dir.setMode(new WalkingMode());
        dir.getEta();
        dir.getDirection();
    }

    public static void iterator() {
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
    public static void iteratorEx() {
        var list = new ProductCollection();
        list.add(new Product(1, "Isaias"));
        list.add(new Product(2, "Mariana"));
        list.add(new Product(3, "Amy"));
        list.add(new Product(4, "Emma"));

        var it = list.getIterator();
        while (it.hasNext()) {
            System.out.println(it.current().toString());
            it.next();
        }
    }

    public static void strategy() {
        var imgStorage = new ImageStorage();
        imgStorage.store("new.jpg", new JpegCompressor(), new BlackAndWhiteFilter());
    }
    public static void strategyEx() {
        var chat = new ChatClient(new DesEncryption());
        chat.send("hola mundo");
    }

    public static void template() {
        var task = new TransferMoneyTask();
        task.execute();
    }
    public static void templateEx() {
        var main = new MainWindow();
        main.close();
    }

    public static void command() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }

    public static void observer() {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(7);
    }

    public static void mediator() {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteracion();
    }
    public static void mediatorObservable() {
        var dialog = new com.iax.mediatorObservable.ArticlesDialogBox();
        dialog.simulateUserInteracion();
    }

    public static void chainOfResponsibility() {
        // Auth -> Logger -> compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "123456"));
    }

    public static void visitor() {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlighOperation());
        document.execute(new PlainTextOperation());
    }

    public static void main(String[] args) {
        visitor();
    }
}
