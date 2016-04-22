$(document).ready(function() {
    $('#Ingresar1').bootstrapValidator({
    	 feedbackIcons: {
    		 valid: 'glyphicon glyphicon-ok',
    		 invalid: 'glyphicon glyphicon-remove',
    		 validating: 'glyphicon glyphicon-refresh'
    	 },
    	 fields: {
    		 nombre: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El nombre es requerido'
    				 },
                     stringLength: {
                         max: 25,
                         message: 'El nombre debe contener maximo 25 caracteres'
                     }
    			 }
    		 },
    		 apellido: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El apellido es requerido'
    				 },
                     stringLength: {
                         max: 25,
                         message: 'El apellido debe contener maximo 25 caracteres'
                     }
    			 }
    		 },
    		 mail: {
                 validators: {
                     notEmpty: {
                         message: 'El correo es requerido y no puede ser vacio'
                     },
                     emailAddress: {
                         message: 'El correo electronico no es valido'
                     },
                     stringLength: {
                         max: 30,
                         message: 'El mail debe contener maximo 30 caracteres'
                     }
                 }   
             },
             telefono: {
                 validators: {
                     notEmpty: {
                         message: 'El telefono es requerido'
                     },
                     stringLength: {
                         max: 20,
                         message: 'El telefono debe contener maximo 20 caracteres'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: 'El teléfono solo puede contener números'
                     }
                 }
             },
    		 rut: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El rut es requerido'
    				 },
                     stringLength: {
                         max: 15,
                         message: 'El rut debe contener maximo 15 caracteres'
                     },stringLength: {
                         min: 10,
                         message: 'El rut debe contener minimo 10 caracteres'
                     }
    			 }
    		 },
    		 cargo: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El cargo es requerido'
    				 },
                     stringLength: {
                         max: 25,
                         message: 'El cargo debe contener maximo 25 caracteres'
                     }
    			 }
    		 },
    		 dirrecion: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El dirrecion es requerido'
    				 },
                     stringLength: {
                         max: 25,
                         message: 'El dirrecion debe contener maximo 25 caracteres'
                     }
    			 }
    		 },    		 
    	 }
    });

    $('#Update').bootstrapValidator({
         feedbackIcons: {
             valid: 'glyphicon glyphicon-ok',
             invalid: 'glyphicon glyphicon-remove',
             validating: 'glyphicon glyphicon-refresh'
         },
         fields: {
             id: {
                 validators: {
                     notEmpty: {
                         message: 'El id es requerido'
                     },
                     stringLength: {
                         max: 20,
                         message: 'El id debe contener maximo 10 caracteres'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: 'El id solo puede contener números'
                     }
                 }
             },
             nombre: {
                 validators: {
                     notEmpty: {
                         message: 'El nombre es requerido'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El nombre debe contener maximo 25 caracteres'
                     }
                 }
             },
             apellido: {
                 validators: {
                     notEmpty: {
                         message: 'El apellido es requerido'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El apellido debe contener maximo 25 caracteres'
                     }
                 }
             },
             mail: {
                 validators: {
                     notEmpty: {
                         message: 'El correo es requerido y no puede ser vacio'
                     },
                     emailAddress: {
                         message: 'El correo electronico no es valido'
                     },
                     stringLength: {
                         max: 50,
                         message: 'El mail debe contener maximo 50 caracteres'
                     }
                 }   
             },
             telefono: {
                 validators: {
                     notEmpty: {
                         message: 'El telefono es requerido'
                     },
                     stringLength: {
                         max: 20,
                         message: 'El telefono debe contener maximo 20 caracteres'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: 'El teléfono solo puede contener números'
                     }
                 }
             },
    		 rut: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El rut es requerido'
    				 },
                     stringLength: {
                         max: 15,
                         message: 'El rut debe contener maximo 15 caracteres'
                     },stringLength: {
                         min: 10,
                         message: 'El rut debe contener minimo 10 caracteres'
                     }
    			 }
    		 },
    		 cargo: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El cargo es requerido'
    				 },
                     stringLength: {
                         max: 25,
                         message: 'El cargo debe contener maximo 25 caracteres'
                     }
    			 }
    		 },
    		 dirrecion: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El dirrecion es requerido'
    				 },
                     stringLength: {
                         max: 25,
                         message: 'El dirrecion debe contener maximo 25 caracteres'
                     }
    			 }
    		 },             
             
         }
    });

    $('#ModificarUsuario').bootstrapValidator({
         feedbackIcons: {
             valid: 'glyphicon glyphicon-ok',
             invalid: 'glyphicon glyphicon-remove',
             validating: 'glyphicon glyphicon-refresh'
         },
         fields: {
        	 nickname: {
                 validators: {
                     notEmpty: {
                         message: 'El nickname es requerido'
                     },
                     stringLength: {
                         min: 4,
                         message: 'El nickname debe contener minimo 4 caracteres'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El nickname debe contener maximo 25 caracteres'
                     }
                 }
             },
             password: {
                 validators: {
                     notEmpty: {
                         message: 'El password es requerido'
                     },
                     stringLength: {
                         min: 4,
                         message: 'El password debe contener minimo 4 caracteres'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El password debe contener maximo 25 caracteres'
                     }
                 }
             },
         }
    });
    $('#BorrarU').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	 nickname: {
                 validators: {
                     notEmpty: {
                         message: 'El nickname es requerido'
                     }, 
                     
                     stringLength: {
                         min: 4,
                         message: 'El nickname debe contener minimo 4 caracteres'
                     },
                     
                     stringLength: {
                         max: 25,
                         message: 'El nickname debe contener maximo 25 caracteres'
                     }
                 }
             },
             password: {
                 validators: {
                     notEmpty: {
                         message: 'El password es requerido'
                     },
                     stringLength: {
                         min: 4,
                         message: 'El password debe contener minimo 4 caracteres'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El password debe contener maximo 25 caracteres'
                     }
                     
                 }
             },
        }
   });
    $('#IngresarU').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	 nickname: {
                 validators: {
                     notEmpty: {
                         message: 'El nickname es requerido'
                     },
                     
                     stringLength: {
                         min: 4,
                         message: 'El nickname debe contener minimo 4 caracteres'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El nickname debe contener maximo 25 caracteres'
                     }
                 }
             },
             password: {
                 validators: {
                     notEmpty: {
                         message: 'El password es requerido'
                     },
                     stringLength: {
                         max: 25,
                         message: 'El password debe contener maximo 25 caracteres'
                        	 
                     },
                     stringLength: {
                         min: 4,
                         message: 'El password debe contener minimo 4 caracteres'
                     },
                     
                 }
             },
             
             
        }
   });
    $('#Borrar').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            
   		 rut: {
   			 validators: {
   				 notEmpty: {
   					 message: 'El rut es requerido'
   				 },
                    stringLength: {
                        max: 15,
                        message: 'El rut debe contener maximo 15 caracteres'
                    },stringLength: {
                        min: 10,
                        message: 'El rut debe contener minimo 10 caracteres'
                    }
   			 }
   		 },
   		              
            
        }
   });
    
});