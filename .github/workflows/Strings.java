����   4 P  Strings  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 	LStrings; main ([Ljava/lang/String;)V  Appu  Star	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder  String length of First Name 
      (Ljava/lang/String;)V
 " $ # java/lang/String % & length ()I
  ( ) * append (I)Ljava/lang/StringBuilder;
  , - . toString ()Ljava/lang/String;
 0 2 1 java/io/PrintStream 3   println 5 Upper case of first name 
 " 7 8 . toUpperCase
  : ) ; -(Ljava/lang/String;)Ljava/lang/StringBuilder; = Lower case of first name 
 " ? @ . toLowerCase B Index of u in first name 
 " D E F lastIndexOf (I)I H Name:  args [Ljava/lang/String; fn Ljava/lang/String; ln 
SourceFile Strings.java !               /     *� �    
                    	       �     �LM� � Y� +� !� '� +� /� � Y4� +� 6� 9� +� /� � Y<� +� >� 9� +� /� � YA� +u� C� '� +� /� � YG� +� 9,� 9� +� /�    
   "        
   8  Q  l  �          � I J    � K L   � M L   N    O