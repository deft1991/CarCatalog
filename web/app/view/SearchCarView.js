/**
 * Created by deft1 on 01.07.2017.
 */
Ext.define('CarCatalog.view.SearchCarView', {
    extend: 'Ext.form.Panel',
    alias: 'widget.searchCarView',
    bodyPadding: 10,
    items: [
        {
            xtype: 'textfield',
            name: 'search',
            fieldLabel: 'Введите название модели',
            maxLength: 200
        }
    ]
});
